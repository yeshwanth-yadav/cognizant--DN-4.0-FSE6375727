package com.die.dependency;

public class Main {
	public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

       
        service.displayCustomer("101");
        service.displayCustomer("999"); // non-existent ID
    }
}
