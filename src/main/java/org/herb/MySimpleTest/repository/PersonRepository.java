/**
 * 
 */
package org.herb.MySimpleTest.repository;

import org.herb.MySimpleTest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author herb
 *
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	Person findByAlias(String alias);

}
