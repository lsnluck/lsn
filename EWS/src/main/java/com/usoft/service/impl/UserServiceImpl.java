package com.usoft.service.impl;

import com.usoft.dao.IUserDAO;
import com.usoft.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDAO userDAO;
    @Override
    public String login(String uname, String upwd) {
        try{
            String str=userDAO.login(uname,upwd);
            return str;
        }catch (Exception e){
e.printStackTrace();
        }
       return null;
    }

    @Override
    public boolean register(String uname, String upwd, String email) {

        boolean temp=userDAO.register(uname,upwd,email);
        return temp;
    }

    @Override
    public List<Map<String, Object>> findAllUser(int page, int pageSize) {
        return userDAO.findAllUser(page,pageSize);
    }
}
