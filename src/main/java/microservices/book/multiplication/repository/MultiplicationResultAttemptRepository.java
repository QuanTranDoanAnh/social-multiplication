package microservices.book.multiplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationResultAttemptRepository extends CrudRepository<MultiplicationResultAttempt, Long> {

	/**
	 * @return the latest 5 attempts for a given user, identified by their alias.
	 */
	List<MultiplicationResultAttempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);
}
