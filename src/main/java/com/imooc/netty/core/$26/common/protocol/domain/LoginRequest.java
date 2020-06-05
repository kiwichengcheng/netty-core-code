package com.imooc.netty.core.$26.common.protocol.domain;

import com.imooc.netty.core.$26.common.protocol.Request;
import com.imooc.netty.core.$26.common.protocol.Response;
import io.netty.util.internal.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tangtong
 * @date: 2020/6/5
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginRequest implements Request {
    private String username;
    private String password;

    @Override
    public Response operate() {
        ObjectUtil.checkNotNull(username, "username");
        ObjectUtil.checkNotNull(password, "password");
        if (username.equals("tt") && password.equals("123456")) {
            return new LoginResponse(true, "");
        }
        return new LoginResponse(false, "username or password error");
    }
}
