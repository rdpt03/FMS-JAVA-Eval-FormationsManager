package fr.fms.entities;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private List<Order> orderList;

    public User() {
    }

    public User(int id, String username, String password, List<Order> orderList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.orderList = orderList;
    }
}
