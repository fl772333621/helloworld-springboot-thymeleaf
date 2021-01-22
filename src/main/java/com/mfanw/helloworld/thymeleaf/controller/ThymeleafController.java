package com.mfanw.helloworld.thymeleaf.controller;

import com.mfanw.helloworld.thymeleaf.dto.UserInfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello Controller
 *
 * @author mengwei
 */
@Controller
public class ThymeleafController {

    /**
     * 浏览器请求网址：http://host:port/to_index，则会将index.html内容展示出来
     *
     * @return templates/index.html内容
     */
    @GetMapping(path = "/to_index")
    public String toIndex() {
        return "index";
    }

    /**
     * 浏览器请求网址：http://host:port/user_info，user_info.html内容展示出来，并传递数据到页面内
     *
     * @return templates/user_info.html内容
     */
    @GetMapping(path = "/user_info")
    public String userInfo(Model model) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setId(1);
        userInfoDto.setUsername("张三");
        userInfoDto.setPassword("password4zhangsan");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("篮球");
        hobbies.add("shopping");
        hobbies.add("滑雪");
        hobbies.add("game");
        userInfoDto.setHobbies(hobbies);
        Map<String, String> secrets = new HashMap<>();
        secrets.put("IDCard", "1233211234567");
        secrets.put("Address", "北京市朝阳区来广营");
        secrets.put("PhoneNO", "86+13811112222");
        userInfoDto.setSecrets(secrets);
        userInfoDto.setStatus(true);
        model.addAttribute("userInfoDto", userInfoDto);
        return "user_info";
    }
}
