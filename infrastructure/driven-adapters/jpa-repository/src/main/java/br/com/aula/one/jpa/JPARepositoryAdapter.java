package br.com.aula.one.jpa;

import br.com.aula.one.jpa.helper.AdapterOperations;
import br.com.aula.one.model.customer.CustomerModel;
import br.com.aula.one.model.customer.gateways.CustomerRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<CustomerModel, br.com.aula.one.jpa.Customer, Long, JPARepository> implements CustomerRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, CustomerModel.CustomerModelBuilder.class).build());
    }

    @Override
    public void saveCustomer(CustomerModel userModel) {
        this.save(userModel);
    }

    @Override
    public List<CustomerModel> listAllUsers() {
        return this.findAll();
    }

    @Override
    public CustomerModel findUser(Long id) {
        return this.findById(id);
    }

    @Override
    public void delete(Long id) {
        this.deleteById(id);
    }

    @Override
    public CustomerModel update(CustomerModel userModel) {
        return this.update(userModel);
    }
}
