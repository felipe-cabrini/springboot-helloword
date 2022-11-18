package br.com.aula.one.api;
import br.com.aula.one.model.customer.CustomerModel;
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
    public String save(@RequestBody CustomerModel customerModel){
        customerUseCase.saveCustomer(customerModel);
        return "customer saved";
    }

    @GetMapping("/findallusers")
    public List<CustomerModel> findAll() {
        return customerUseCase.listAllCustomers();
    }

    @GetMapping("/finduser/{id}")
    public CustomerModel finduser(@PathVariable(value = "id") Long id) {
        return customerUseCase.findCustomer(id);
    }

    @PostMapping("/update")
    public String update(@RequestBody CustomerModel customerModel){
        customerUseCase.update(customerModel);
        return "customer updated";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
        customerUseCase.delete(id);
        return "customer deleted";
    }
}
