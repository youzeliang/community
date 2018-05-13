package com.community.com.rest;

import com.community.com.model.bo.RestResponseBo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;


/**
 * @author youzeliang
 * on 2018/5/13
 */
public class AuthController {
    public RestResponseBo login(@RequestParam String name,
                                @RequestParam String password,
                                HttpServletRequest request,
                                HttpServletResponse response
    ){
        return RestResponseBo.ok();
    }
}
