package com.skcet.day3.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day3.Model.Employee;




	public interface EmpRepo extends JpaRepository<Employee, Integer>{
	     

		

	

	public boolean existsById(int id);
}
