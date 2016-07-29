package de.mvitz.javaspektrum.java9.stream;

import java.util.List;
import java.util.stream.Stream;

public class OfNullableExample {

    interface Order {}

    interface Customer {
        List<Order> getOrders();
    }

    public static void main(String[] args) {
        final Customer customer = findCustomerById(4711);

        final Stream<Order> orderStream =
                Stream.ofNullable(customer)
                    .flatMap(c -> c.getOrders().stream());
    }

    private static Customer findCustomerById(long id) {
        return null;
    }

}
