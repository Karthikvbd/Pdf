package com.mamce.EmployeeService.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/emp")
	public Employees addEmployee(@RequestBody Employees emp) {
		return repo.save(emp);
	}
	@GetMapping("/emp")
	public List<Employees>getEmployee(){
		return repo.findAll();
	}
    @GetMapping("/emp/{id}")
	public Employees getEmployeesByid(@PathVariable Integer id){
		return repo.findById(id).get();
	}
    @DeleteMapping("/emp/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
    	 repo.deleteById(id);
    }
    @PutMapping("/emp/{id}")
    public Employees updateEmployee(@PathVariable Integer id, @RequestBody Employees emp) {
    emp.setId(id);
    return repo.save(emp);
    	
    }

}
