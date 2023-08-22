package com.skcet.day3.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day3.Model.Employee;
import com.skcet.day3.Service.ApiService;



@Service
public class ApiServiceImpl implements ApiService {
	
	      
		@Autowired
		private EmpRepo empRepo;
		
		@Override
		public boolean addEmp(Employee employee) {
			boolean empExists=empRepo.existsById(employee.getId());
			if(!empExists) {
				empRepo.save(employee);
				return true;
			}
			else {
				return false;
			}
		}
		
		@Override
		public List<Employee> getEmp(){
			return empRepo.findAll();
		}
			
}
