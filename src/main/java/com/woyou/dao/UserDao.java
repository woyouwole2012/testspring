package com.woyou.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void save(){
        System.out.println("dao ---");
    };
}
