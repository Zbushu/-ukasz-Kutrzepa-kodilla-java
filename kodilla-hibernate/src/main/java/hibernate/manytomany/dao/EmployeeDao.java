package hibernate.manytomany.dao;


import hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
        @Query
        List<Employee> retrieveEmployeesWithSurname(@Param("LASTNAME") String lastName);
        @Query
        List<Employee> retrieveEmployeeWithSurnameContaining(@Param("ARG") String searchPhrase);
}
