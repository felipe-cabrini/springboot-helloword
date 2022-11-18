package br.com.aula.one.model.customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {


    private Long id;
    private String name;
    private String lastname;
    private String type;
    private Double salary;
}
