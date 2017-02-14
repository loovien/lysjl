package com.lianying.shangjialian.biz.impl.user;

import com.lianying.shangjialian.biz.user.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by luowen on 2017/2/14.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    public Boolean login(String username, String password) {
        return true;
    }
}
