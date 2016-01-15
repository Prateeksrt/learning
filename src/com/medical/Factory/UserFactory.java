package com.medical.Factory;

import com.medical.User;

public class UserFactory {

    public User makeUser(String name){
        return new User(name);
    }
}
