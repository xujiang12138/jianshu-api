package com.example.jianshu.service;

import com.example.jianshu.entity.Button;

import java.util.List;

/**
 * Created by xuj on 2018/10/22.
 */
public interface ButtonService {
    List<Button> getButtonName();
    Button  getButton(int id);
}
