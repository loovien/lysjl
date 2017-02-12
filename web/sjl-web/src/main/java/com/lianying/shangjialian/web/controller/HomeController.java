package com.lianying.shangjialian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luowen on 2017/2/10.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping
    public String home() {
        return "hello";
    }

    @RequestMapping(value = "/test/{name}")
    public String homeView(@PathVariable String name, Model model) {
        model.addAttribute("a", "-a-");
        model.addAttribute("b", name);
        System.out.println("name = " + name);
        return "home";
    }

    @RequestMapping("/info")
    @ResponseBody
    public Map<String, String> info() {
        Map<String, String> hashMap = new HashMap<String, String>();



        hashMap.put("name", "luowen");
        hashMap.put("age", "28");
        hashMap.put("lover", "maomao");
        return hashMap;
    }

}
