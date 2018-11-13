package com.example.demo.dao;

import com.example.demo.core.Mapper;
import com.example.demo.model.SysUser;
import com.example.demo.model.vo.AllOneVo;
import com.example.demo.model.vo.AllUserVO;
import com.example.demo.model.vo.HotVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysUserMapper extends Mapper<SysUser> {
    @Select("SELECT s.id, s.avatar ,s.nick_name ,s.like_count,s.words_count FROM sys_user s ORDER BY like_count DESC")
    List<HotVo> getHotSysUser();
    @Select("SELECT * FROM sys_user")
    List<SysUser> getAll();
    @Select("SELECT s.id,s.avatar,s.description,s.nick_name FROM sys_user s ")
    List<AllOneVo> getOneUser();

}