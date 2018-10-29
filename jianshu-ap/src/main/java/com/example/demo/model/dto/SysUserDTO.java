package com.example.demo.model.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by xuj on 2018/10/25.
 */
@Data
@Builder
public class SysUserDTO {
    private String email;
    private String password ;
}
