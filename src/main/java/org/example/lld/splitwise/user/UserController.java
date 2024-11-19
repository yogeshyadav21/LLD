package org.example.lld.splitwise.user;

import org.example.lld.splitwise.group.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserController {

    List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public User createUser(String name){
        User user = new User(UUID.randomUUID(), name);
        addUser(user);
        return user;
    }

    public void createUserWithGroup(String name, Group group){
        User user = new User(UUID.randomUUID(), name);
        group.addUser(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
