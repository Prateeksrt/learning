package com.collection;

/**
 * Created by prateeks on 10/11/15.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        int n=3;
        int a[] = {0,0,0,0,0,0,0};

        a[++n]=n++;

        for(int i :a){
            System.out.println(a[i]);
        }
    }


}
