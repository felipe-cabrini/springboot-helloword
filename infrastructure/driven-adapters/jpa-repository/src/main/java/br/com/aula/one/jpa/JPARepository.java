package br.com.aula.one.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<Customer, Long>, QueryByExampleExecutor<Customer> {
}
