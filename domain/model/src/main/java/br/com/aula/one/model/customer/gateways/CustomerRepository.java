package br.com.aula.one.model.customer.gateways;

import br.com.aula.one.model.customer.Customer;

import java.util.List;

public interface CustomerRepository {

    void saveCustomer(Customer userModel);

    List<Customer> listAllUsers();

    Customer findUser(Long id);

    void delete(Long id);

    Customer update(Customer userModel);
}
