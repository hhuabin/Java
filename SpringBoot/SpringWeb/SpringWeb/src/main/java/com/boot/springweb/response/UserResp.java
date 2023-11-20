package com.boot.springweb.response;

import com.boot.springweb.bean.User;
import java.util.List;

/**
 * @author bin
 * @date 2023-06-09-10:24
 */
public class UserResp extends BaseResponse {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
