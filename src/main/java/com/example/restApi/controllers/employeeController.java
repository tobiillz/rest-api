package com.example.restApi.controllers;

import com.example.restApi.models.Employee;
import com.example.restApi.EmployeeDAO;
import com.example.restApi.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class employeeController {

    @Autowired
    private EmployeeDAO employeeDao;

    //Create a Get method to fetch the list of employees
    @GetMapping(path = "/",
            produces = "application/json")

    public Employees getEmployees()
    {
        return employeeDao
                .getAllEmployees();
    }

//    @GetMapping("{employee_id}")
//
//    public Employees getEmployees(String employee_id)
//    {
//        return employeeDao
//                .getAllEmployees(String employee_id);
//    }


//    Create a POST method to add an employee to the list
//    old way
    @PostMapping(path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addEmployee(
            @RequestBody Employee employee){

        Integer Id = employeeDao.getAllEmployees().getEmployeeList().size() +1;
        employee.setId(Id);

        employeeDao.addEmployee(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();

        return ResponseEntity.created(location).build();



    }


    //Create a Delete method to delete any employee by ID
//    @DeleteMapping(path = "/",
//                                )
}
