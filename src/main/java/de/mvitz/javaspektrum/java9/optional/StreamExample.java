package de.mvitz.javaspektrum.java9.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    interface Order {}

    interface Customer {
        List<Order> getOrders();
    }

    private static Optional<Customer> findCustomerById(long id) { return Optional.empty(); }

    public static void main(String[] args) {
        final Stream<Order> lazy = findCustomerById(42).stream()
                .flatMap(c -> c.getOrders().stream());

        final List<Order> eager = findCustomerById(42)
                .map(Customer::getOrders)
                .orElse(Collections.emptyList());
    }
}
