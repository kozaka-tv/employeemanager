package com.example.employeemanager.repo;

import com.example.employeemanager.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional(Transactional.TxType.MANDATORY)
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
}
