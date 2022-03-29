package com.termii.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.termii.model.Staff;

@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class StaffRepositoryTests {

	@Autowired 
	private StaffRepository repo;
                    // KINDLY UNCOMMENT FOR UNIT TESTING 
//	@Test
//	public void testCreatenewStaff() {
//		Staff staff = new Staff(8, "Banjoko Abiodun l ",(long) 2345623, "Lateef.banjoko@yahoo.com","34 qwerty road");
//		Staff savedStaff = repo.save(staff);
//		
//		assertThat(savedStaff.getId()).isGreaterThan(0);
//	}

	
	@Test
	public void testListAllStaff() {
		Iterable<Staff> listCustomers = repo.findAll();
		listCustomers.forEach(staff -> System.out.println(staff));
	}
	
	@Test
	public void testGetUserById() {
		Staff userHabay = repo.findById(1).get();
		System.out.println(userHabay);
		assertThat(userHabay).isNotNull();
	}
	
}
