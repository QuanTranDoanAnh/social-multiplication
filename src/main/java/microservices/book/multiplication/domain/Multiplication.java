package microservices.book.multiplication.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * This represents a Multiplication (a*b).
 * @author anhquan
 *
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class Multiplication {

	@Id
	@GeneratedValue
	@Column(name="MULTIPLICATION_ID")
	private Long id;
	
	// Both factors
	private final int factorA;
	private final int factorB;
	
	// Empty constructor for JSON (de)serialization
	Multiplication() {
		this(0,0);
	}

}
