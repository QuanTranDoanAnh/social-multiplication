package microservices.book.multiplication.repository;

import org.springframework.data.repository.CrudRepository;

import microservices.book.multiplication.domain.Multiplication;

public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {

}
