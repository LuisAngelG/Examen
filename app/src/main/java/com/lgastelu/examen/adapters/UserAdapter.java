package com.lgastelu.examen.adapters;

import com.lgastelu.examen.models.User;

import java.util.List;

public class UserAdapter{

    private List<User> users;

    public UserAdapter(List<User> users){
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
