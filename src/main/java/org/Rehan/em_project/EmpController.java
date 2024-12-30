package org.Rehan.em_project;

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

public class EmpController {
    //List<Employee> employees = new ArrayList<>();
    //EmployeeService employeeSerivce = new EmployeeServiceImpl();
    
    //Dependency Injection
    @Autowired
    EmployeeService employeeService; //We should always inject dependency inside contstructor (read about this in detail)

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getAllEmployeeById(@PathVariable Long id){
        return employeeService.readEmployee(id);
    }


    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        //employees.add(employee);
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}") //in curly braces is a path variable, this will be in url and from there the thing will come
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id))
            return "Delete Successfully";
        return "Not Found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
}   
