package com.test.api.service;

import com.test.api.param.UserBO;
import com.test.api.result.UserVO;

/**
 * @author cuiyt
 * @Descrption
 * @create 2018/8/14
 */
public interface IUserService {
    UserVO getUserInfo(UserBO bo);
}
