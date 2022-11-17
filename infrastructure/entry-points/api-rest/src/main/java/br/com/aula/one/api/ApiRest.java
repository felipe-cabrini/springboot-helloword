package br.com.aula.one.api;
import br.com.aula.one.model.customer.Customer;
import br.com.aula.one.usecase.findcustomer.CustomerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final CustomerUseCase customerUseCase;


    @PostMapping("/save")
    public String save(@RequestBody Customer customer){
        customerUseCase.saveCustomer(customer);
        return "customer saved";
    }

    @GetMapping("/findallusers")
    public List<Customer> findAll() {
        return customerUseCase.listAllCustomers();
    }

    @GetMapping("/finduser/{id}")
    public Customer finduser(@PathVariable(value = "id") Long id) {
        return customerUseCase.findCustomer(id);
    }

    @PostMapping("/update")
    public String update(@RequestBody Customer customer){
        customerUseCase.update(customer);
        return "customer updated";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
        customerUseCase.delete(id);
        return "customer deleted";
    }
}
