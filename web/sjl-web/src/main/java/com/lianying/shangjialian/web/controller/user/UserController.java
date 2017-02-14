package com.lianying.shangjialian.web.controller.user;

import com.lianying.shangjialian.model.dto.user.UserRO;
import com.lianying.shangjialian.service.user.UserService;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luowen on 2017/2/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public Map<String, UserRO> info(@PathVariable Integer id) {
        Map<String, UserRO> hashMap = new HashMap();

        UserRO userRO = userService.queryById(id);
        hashMap.put("info", userRO);

        return hashMap;
    }
}
