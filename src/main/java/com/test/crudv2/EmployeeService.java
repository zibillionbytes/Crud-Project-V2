package com.test.crudv2;

import com.test.crudv2.Employee;
import com.test.crudv2.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employeee){
        return employeeRepository.save(employeee);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long employeeId){
        return employeeRepository.findById(employeeId).get();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public void deleteEmployeeById(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }
}