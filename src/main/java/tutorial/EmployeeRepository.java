package tutorial;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by michaelsmith on 2/20/17.
 * Copyright Acceptto Corporation.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
