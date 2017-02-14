package com.lianying.shangjialian.service.impl.user;

import com.lianying.shangjialian.dal.dao.user.UserDao;
import com.lianying.shangjialian.model.dataobject.user.UserDO;
import com.lianying.shangjialian.model.dto.user.UserRO;
import com.lianying.shangjialian.service.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luowen on 2017/2/14.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public Boolean login(String username, String password) {
        return true;
    }

    public UserRO queryById(Integer id) {

        UserRO userRO = new UserRO();

        UserDO userDO = userDao.queryById(id);

        if(userDO == null) {
            throw new RuntimeException("查找数据不存在");
        }

        BeanUtils.copyProperties(userDO, userRO);

        System.out.println(userDO);
        System.out.println("==============beautifully split line ======================");
        System.out.println(userRO);

        return userRO;
    }
}
