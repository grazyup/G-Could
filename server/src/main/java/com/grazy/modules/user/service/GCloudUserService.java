package com.grazy.modules.user.service;

import com.grazy.modules.user.context.UserLoginContext;
import com.grazy.modules.user.context.UserRegisterContext;
import com.grazy.modules.user.domain.GCloudUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author gaofu
 * @description 针对表【g_cloud_user(用户信息表)】的数据库操作Service
 * @createDate 2024-01-24 17:35:44
 */
public interface GCloudUserService extends IService<GCloudUser> {

    /**
     * 用户注册业务
     *
     * @param userRegisterContext 注册信息对象
     * @return 用户ID
     */
    Long register(UserRegisterContext userRegisterContext);

    /**
     * 用户登录业务
     *
     * @param userLoginContext 用户登录信息
     * @return 登录凭证accessToken
     */
    String login(UserLoginContext userLoginContext);
}
