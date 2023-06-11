package com.example.restApi;

import com.example.restApi.models.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

        private static Employees list = new Employees();

        static {
            list.getEmployeeList().add(
                    new Employee(
                            1,
                            "prem",
                            "tiwari",
                            "AA001",
                            "premtiwari@hp.com",
                            "miss"
                    ));
            list.getEmployeeList().add(
                    new Employee(
                            2,
                            "vikash",
                            "kumar",
                            "AA002",
                            "vikashkumar@hp.com",
                            "Mr"
                    ));
            list.getEmployeeList().add(
                    new Employee(
                            3,
                            "Ritesh",
                            "Ojha",
                            "AA003",
                            "riteshojha@hp.com",
                            "Mrs"
                    ));
        }
    public Employees getAllEmployees(){
        return list;
    }
    public void addEmployee(Employee employee){
            list.getEmployeeList().add(employee);
    }
}
