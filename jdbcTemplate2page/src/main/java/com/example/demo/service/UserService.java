package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService  {

    List<User> findAll();

    List<User> findAllbyPage(int pagenum, int pagerow);

    int countAll();
}
