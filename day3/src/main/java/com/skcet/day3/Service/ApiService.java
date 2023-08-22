package com.skcet.day3.Service;

import java.util.List;


import com.skcet.day3.Model.Employee;

public interface ApiService {
    
	public boolean addEmp(Employee employee);
	public List<Employee> getEmp();

	
     
}
