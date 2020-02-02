package org.computer.sbshoppingcart.model;

import org.computer.sbshoppingcart.entity.Account;

public class UserInfo {


    private String user_name;
    private Boolean active;
    private String user_role;


    public UserInfo() {

    }

    public UserInfo(String user_name, Boolean active, String user_role) {
        this.user_name = user_name;
        this.active = active;
        this.user_role = user_role;
    }


    public UserInfo(Account account) {
        this.user_name = account.getUserName();
        this.active = account.isActive();
        this.user_role = account.getUserRole();
    }

    public String getUser_name() {
        return user_name;
    }

    public Boolean getActive() {
        return active;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}
