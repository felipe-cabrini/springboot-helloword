package br.com.aula.one.model.customer.gateways;

import br.com.aula.one.model.customer.CustomerModel;

import java.util.List;

public interface CustomerRepository {

    void saveCustomer(CustomerModel userModel);

    List<CustomerModel> listAllUsers();

    CustomerModel findUser(Long id);

    void delete(Long id);

    CustomerModel update(CustomerModel userModel);
}
