package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> clients = generateClients();
        Deque<Person> deque = new ArrayDeque<>();
        for (Person client : clients) {
            deque.addLast(client);
        }
        while (!deque.isEmpty()) {
            Person thisPerson = deque.poll();
            thisPerson.rideAttraction();
            if (thisPerson.getTickets() > 0) {
                deque.offerLast(thisPerson);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("David", "Stevenson", 3));
        clients.add(new Person("Lev", "Khmyz", 2));
        clients.add(new Person("Travis", "Scott", 1));
        clients.add(new Person("Alex", "Vivian", 4));
        clients.add(new Person("Kate", "Harley", 5));
        return clients;
    }
}