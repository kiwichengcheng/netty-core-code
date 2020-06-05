package com.imooc.netty.core.$26.common.protocol.domain;

import com.imooc.netty.core.$26.common.protocol.Response;
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
public class LoginResponse implements Response {
    private boolean success;
    private String message;
}
