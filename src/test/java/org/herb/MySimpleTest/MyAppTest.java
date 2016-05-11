/**
 * 
 */
package org.herb.MySimpleTest;

import static org.junit.Assert.*;

import org.herb.MySimpleTest.domain.Person;
import org.herb.MySimpleTest.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author herb
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={App.class})
public class MyAppTest {
	
	@Autowired
	PersonRepository repository;
	
	@Test
	public void testRepositoryNotNull() {
		assertNotNull(repository);
	}
	
	@Test
	public void testSaveAndRead() {
		Person someGuy = new Person();
		someGuy.setFirstName("Tony");
		someGuy.setLastName("Stark");
		someGuy.setAlias("Iron Man");
		
		repository.save(someGuy);
		
//		assertEquals(1, repository.count());
		
		Person ironman = repository.findByAlias("Iron Man");
		
		assertNotNull(ironman);
		
	}

}
