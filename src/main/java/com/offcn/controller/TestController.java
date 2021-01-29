package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author： xiaoyu
 * @date： 2021/1/28 10:29
 * @version：1.0
 * @Description：
 */
@Controller   //注意：如果首页thymeleaf模板，则注解需要使用Controller
public class TestController {

    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("message","欢迎来到优就业学习");
        return "index01";
    }


    @RequestMapping("/findOne")
    public String findOne(Model model){
        User user = new User();
        user.setId(1L);
        user.setAge(35);
        user.setName("张三");
        model.addAttribute("user",user);

        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("name","李四");
        map.put("sex","男");
        model.addAttribute("map",map);
        return "index02";
    }


    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setAge(15);
        user1.setName("张三");

        User user2 = new User();
        user2.setId(2L);
        user2.setAge(35);
        user2.setName("李四");

        User user3 = new User();
        user3.setId(3L);
        user3.setAge(30);
        user3.setName("王五");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("users",list);
        return "index03";
    }



    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("message","欢迎来到优就业学习");
        return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index05";
    }


    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("number",123.456);
        String str = "基金个哦国内干供电念佛二进宫啊非涉农ofIE金佛鞥脑if法国呢哦积分偶家佛法饿哦们供你的覅额非那恐怕分配积分解耦股Jane哇哦";
        model.addAttribute("str",str);
        return "index06";
    }
}
