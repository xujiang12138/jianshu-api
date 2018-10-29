package com.example.demo.service;
import com.example.demo.core.Result;
import com.example.demo.model.SysUser;
import com.example.demo.core.Service;
import com.example.demo.model.dto.SysUserDTO;
import com.example.demo.model.vo.SysUserVO;


/**
 * Created by taoranran on 2018/10/25.
 */
public interface SysUserService extends Service<SysUser> {
        Result userLogin(SysUserDTO sysUserDTO);

}
