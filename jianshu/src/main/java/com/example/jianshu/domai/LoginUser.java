package com.example.jianshu.domai;

import lombok.Builder;
import lombok.Data;

/**
 * Created by xuj on 2018/10/22.
 */
@Data
@Builder
public class LoginUser {
    private String email ;
    private String password ;

}
