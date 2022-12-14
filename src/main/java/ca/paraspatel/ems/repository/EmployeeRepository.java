package ca.paraspatel.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.paraspatel.ems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
