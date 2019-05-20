package org.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginImpl implements ILogin {

    String id = "";

    @Autowired(required = false)
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String loginCheck(String userName, String password) {
        System.out.println("boy登录...");
        return "success";
    }
}