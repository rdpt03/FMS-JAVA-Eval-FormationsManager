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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }


    public List<Training> getListOfTrainings() {
        return listOfTrainings;
    }
    public void setListOfTrainings(List<Training> listOfTrainings) {
        this.listOfTrainings = listOfTrainings;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", client=" + client +
                ", listOfTrainings=" + listOfTrainings +
                '}';
    }
}
