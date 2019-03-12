package com.example.controller;


import com.example.dao.UserMapper;
import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 测试类
 * @author: Mr.gao
 * @create: 2019-03-08 15:33
 **/
@Slf4j
@Controller
public class SpringTestController {
//private  static final Logger log= LoggerFactory.getLogger(SpringTestController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name","yuanfei");
        return "hello";
    }
    @ResponseBody
    @RequestMapping("{id}")
    public User user(@PathVariable()Integer id) {
     User user= userMapper.selectByPrimaryKey(id);
     log.info("返回用户: "+user);
        return user;
    }
}
