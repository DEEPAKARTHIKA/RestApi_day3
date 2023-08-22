package com.skcet.day3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day3.Model.Employee;
import com.skcet.day3.Service.ApiService;

@RestController
@RequestMapping("api/v1/employee")
public class ApiController {
       @Autowired
       private ApiService apiservice;
       
       @GetMapping("/getEmp")
       public ResponseEntity<List<Employee>> getEmp(){
    	   return ResponseEntity.status(200).body(apiservice.getEmp());
       }
       
       @PostMapping("/addEmp")
       public ResponseEntity<String> addEmp(@RequestBody Employee employee){
      	 boolean dataSaved=apiservice.addEmp(employee);
      	 if(dataSaved) {
      		 return ResponseEntity.status(200).body("employee added successfully");
      	 }
      	 else {
      		 return ResponseEntity.status(404).body("not added");
      	 }
       }
}
