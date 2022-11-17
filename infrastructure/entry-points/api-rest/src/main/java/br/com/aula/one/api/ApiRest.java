package br.com.aula.one.api;
import br.com.aula.one.usecase.findcustomer.FindCustomerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final FindCustomerUseCase findCustomerUseCase;


    @GetMapping(path = "/find/customer")
    public String commandName() {
      //return findCustomerUseCase.doAction();
        return "Hello World";
    }
}
