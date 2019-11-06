package com.lgastelu.examen.repositories;

import com.lgastelu.examen.models.User;
import com.orm.SugarRecord;

public class UserRepository {

    public static void create(String name, String username, String email, String password){
        User user=new User(name, username, email, password);
        SugarRecord.save(user);
    }

}
