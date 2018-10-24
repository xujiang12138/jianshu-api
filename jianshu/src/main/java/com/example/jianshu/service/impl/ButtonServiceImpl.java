package com.example.jianshu.service.impl;

import com.example.jianshu.dao.ButtonRepository;
import com.example.jianshu.entity.Button;
import com.example.jianshu.service.ButtonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/10/22.
 */
@Service
public class ButtonServiceImpl implements ButtonService {
    @Resource
    private ButtonRepository buttonRepository;
    @Override
    public List<Button> getButtonName() {
        return buttonRepository.findAll();
    }

    @Override
    public Button getButton(int id) {
        return buttonRepository.findById(id).get();
    }
}
