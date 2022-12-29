package org.example;

public class Person {
    private String name;
    private String lastName;
    private int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void rideAttraction() {
        System.out.println(String.format("%s %s ride on the attraction, tickets = %d", this.name, this.lastName, this.tickets));
        tickets--;
    }
}
