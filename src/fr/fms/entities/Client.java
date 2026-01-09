package fr.fms.entities;

import java.util.List;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private List<Order> listOfOrders;

    public Client(int id, String firstName, String lastName, String email, String address, String phoneNumber, List<Order> listOfOrders) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.listOfOrders = listOfOrders;
    }

    public Client() {}
}
