package microservices.book.multiplication.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import microservices.book.multiplication.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByAlias(final String alias);
}
