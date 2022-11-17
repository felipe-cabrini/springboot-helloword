package br.com.aula.one.usecase.findcustomer;

import br.com.aula.one.model.customer.Customer;
import br.com.aula.one.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustomerUseCase {

    private final CustomerRepository customerRepository;

    public void delete(Long id) {
        customerRepository.delete(id);
    }

    public void saveCustomer(Customer customer) {
        customerRepository.saveCustomer(customer);
    }

    public List<Customer> listAllCustomers() {
        return customerRepository.listAllUsers();
    }

    public Customer findCustomer(Long id) {
        return customerRepository.findUser(id);
    }

    public void update(Customer customer) {
        customerRepository.update(customer);
    }
}
