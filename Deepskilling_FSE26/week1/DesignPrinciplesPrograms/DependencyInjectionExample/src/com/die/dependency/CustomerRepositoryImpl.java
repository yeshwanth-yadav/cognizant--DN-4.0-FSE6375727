package com.die.dependency;
import java.util.HashMap;
import java.util.Map;
public class CustomerRepositoryImpl  implements CustomerRepository {
	 private Map<String, Customer> customers = new HashMap<>();

	    public CustomerRepositoryImpl() {
	        customers.put("101", new Customer("101", "Yeshwanth"));
	        customers.put("102", new Customer("102", "Padandala"));
	    }

	    @Override
	    public Customer findCustomerById(String id) {
	        return customers.get(id);
	    }
}
