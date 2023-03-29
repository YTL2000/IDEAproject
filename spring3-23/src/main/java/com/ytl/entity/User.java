package com.ytl.entity;

import org.junit.jupiter.api.Test;

/**
 * @version 1.0
 * @auther YTL
 * @className User
 * since 1.0
 */
public class User {
     private User(){}
     private static User user=new User();
     public static User getUser(){
         return user;
     }
}

