package com.drewlau.payroll;

import org.springframework.data.repository.PagingAndSortingRepository;

// import org.springframework.data.repository.CrudRepository;

// public interface EmployeeRepository extends CrudRepository<Employee, Long> {
// }

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}