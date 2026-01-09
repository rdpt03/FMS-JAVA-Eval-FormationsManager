package fr.fms.entities;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date date;
    private User user;
    private Client client;
    private List<Training> listOfTrainings;


    public Order() {
    }

    public Order(int id, Date date, User user, Client client, List<Training> listOfTrainings) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.client = client;
        this.listOfTrainings = listOfTrainings;
    }
}
