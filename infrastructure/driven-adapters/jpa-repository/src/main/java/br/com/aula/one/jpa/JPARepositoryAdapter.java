package br.com.aula.one.jpa;

import br.com.aula.one.jpa.helper.AdapterOperations;
import br.com.aula.one.model.customer.Customer;
import br.com.aula.one.model.customer.gateways.CustomerRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Customer, br.com.aula.one.jpa.Customer, Long, JPARepository> implements CustomerRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d,Customer.CustomerBuilder.class).build());
    }

    @Override
    public void saveCustomer(Customer userModel) {
        this.save(userModel);
    }

    @Override
    public List<Customer> listAllUsers() {
        return this.findAll();
    }

    @Override
    public Customer findUser(Long id) {
        return this.findById(id);
    }

    @Override
    public void delete(Long id) {
        this.deleteById(id);
    }

    @Override
    public Customer update(Customer userModel) {
        return this.update(userModel);
    }
}
