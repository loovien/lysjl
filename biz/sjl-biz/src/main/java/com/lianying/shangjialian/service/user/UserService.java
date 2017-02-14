package com.lianying.shangjialian.service.user;

import com.lianying.shangjialian.model.dto.user.UserRO;

/**
 * Created by luowen on 2017/2/14.
 */
public interface UserService {

    Boolean login(String username, String password);


    UserRO queryById(Integer id);

}
