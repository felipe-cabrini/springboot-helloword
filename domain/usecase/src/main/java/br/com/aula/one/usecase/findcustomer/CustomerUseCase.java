package br.com.aula.one.usecase.findcustomer;

import br.com.aula.one.model.customer.CustomerModel;
import br.com.aula.one.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustomerUseCase {

    private final CustomerRepository customerRepository;

    public void delete(Long id) {
        customerRepository.delete(id);
    }

    public void saveCustomer(CustomerModel customerModel) {
        customerRepository.saveCustomer(customerModel);
    }

    public List<CustomerModel> listAllCustomers() {
        return customerRepository.listAllUsers();
    }

    public CustomerModel findCustomer(Long id) {
        return customerRepository.findUser(id);
    }

    public void update(CustomerModel customerModel) {
        customerRepository.update(customerModel);
    }
}
