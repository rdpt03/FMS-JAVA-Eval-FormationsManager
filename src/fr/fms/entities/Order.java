package fr.fms.entities;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date date;
    private User user;
    private Client client;
    private List<Training> listOfTrainings;
}
