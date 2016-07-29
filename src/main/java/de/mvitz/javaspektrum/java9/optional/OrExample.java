package de.mvitz.javaspektrum.java9.optional;

import java.util.Optional;

public class OrExample {

    interface Customer {}

    interface CustomerRepository {
        Optional<Customer> findById(long id);
    }

    interface CustomerInMemoryCache {
        Optional<Customer> findById(long id);
    }

    interface CustomerOnDiscCache {
        Optional<Customer> findById(long id);
    }

    public static void main(String[] args) {
        CustomerRepository cr = null;
        CustomerInMemoryCache cimc = null;
        CustomerOnDiscCache codc = null;
        Optional<Customer> customer = cimc.findById(4711)
                .or(() -> codc.findById(4711))
                .or(() -> cr.findById(4711));
    }
}
