package com.imooc.netty.core.$26.common.protocol.domain;

import com.imooc.netty.core.$26.common.protocol.Request;
import com.imooc.netty.core.$26.common.protocol.Response;

/**
 * @author: tangtong
 * @date: 2020/6/5
 */
public enum OperationEnum {

    Login(1,LoginRequest.class, LoginResponse.class),
    PlayCard(2, PlayCardRequest.class, PlayCardResponse.class),
    ;

    private int opcode;
    private Class<? extends Request> requestType;
    private Class<? extends Response> responseType;

    public int getOpcode() {
        return opcode;
    }

    OperationEnum(int opcode, Class<? extends Request> requestType, Class<? extends Response> responseType) {
        this.opcode = opcode;
        this.requestType = requestType;
        this.responseType = responseType;
    }

    public static Class<? extends Request> parseRequestType(int opcode) {
        for (OperationEnum operation : OperationEnum.values()) {
            if (operation.opcode == opcode) {
                return operation.requestType;
            }
        }
        return null;
    }

    public static Class<? extends Response> parseResponseType(int opcode) {
        for (OperationEnum operation : OperationEnum.values()) {
            if (operation.opcode == opcode) {
                return operation.responseType;
            }
        }
        return null;
    }

}
