package com.termii.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.termii.model.Staff;
import com.termii.model.Visitor;

@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class VisitorRepositoryTests {

	@Autowired 
	private VisitorRepository repo;
	// kindly uncomment for test 
//	@Test
//	public void testCreatenewVisitor() {
//		Visitor visitor = new Visitor( 8, "Segun Agunbiade v",(long) 2345623, "Lateef.banjoko@yahoo.com","34 yeahdsksj");
//		Visitor savedVisitor = repo.save(visitor);
//		
//		assertThat(savedVisitor.getId()).isGreaterThan(0);
//	}

	
	@Test
	public void testListAllVisitors() {
		Iterable<Visitor> listVisitors= repo.findAll();
		listVisitors.forEach(staff -> System.out.println(staff));
	}
	
	@Test
	public void testGetVisitorsById() {
		Visitor userHabay = repo.findById(1).get();
		System.out.println(userHabay);
		assertThat(userHabay).isNotNull();
	}
	
}
