package com.example.demo.service;
import com.example.demo.model.Button;
import com.example.demo.core.Service;
import com.example.demo.model.SysUser;
import com.example.demo.model.vo.ButtonArticleVo;
import com.example.demo.model.vo.FanVo;

import java.util.List;
import java.util.Map;


/**
 * Created by taoranran on 2018/10/25.
 */
public interface ButtonService extends Service<Button> {
        List<FanVo> getFan(Integer id);
        List<ButtonArticleVo> getButtonArticle(Integer id);

}
