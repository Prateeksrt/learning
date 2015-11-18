package com.demo;

import java.util.Stack;

class MyStack<E> extends Stack<E>{
    private static final int limit =10;
    @Override
    public E push(E item) {
        if(this.size()==limit) return null;
        return super.push(item);
    }

    @Override
    public synchronized E pop() {
        return super.pop();
    }
}

class CubbyHole {
    int data;
    boolean full = false;
    public synchronized void put(int v) throws InterruptedException {
        while(full) {
            wait();
        }
        data = v;
        System.out.println("Producer put data : " + data);
        full = true;
        notifyAll();
    }
    public synchronized void get() throws InterruptedException {
        while(!full) {
            wait();
        }
        System.out.println("Consumer got data : " + data);
        Thread.sleep(500);
        full = false;
        notifyAll();
    }
}

class Producer implements Runnable {
    CubbyHole c;
    Producer(CubbyHole c) {
        this.c = c;
    }
    public void run() {
        int i=0;
        while(true) {
            try {
                c.put(i++);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {
    CubbyHole c;
    Consumer(CubbyHole c) {
        this.c = c;
    }
    public void run() {
        while(true) {
            try {
                c.get();
            } catch (InterruptedException e) {
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Producer p = new Producer(c);
        Consumer c1 = new Consumer(c);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();
    }
}
