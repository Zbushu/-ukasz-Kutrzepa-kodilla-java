package hibernate.manytomany.facade;

import hibernate.manytomany.Company;
import hibernate.manytomany.Employee;
import hibernate.manytomany.dao.CompanyDao;
import hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    public List<Company> retrieveCompanyByNameContaining(final CompanyDao companyDao, final String searchPhrase) {
        return companyDao.retrieveCompanyByNameContaining("%"+searchPhrase+"%");
    }

    public List<Employee> retrieveEmployeesWithSurnameContaining(final EmployeeDao employeeDao, final String searchPhrase) {
        return employeeDao.retrieveEmployeeWithSurnameContaining("%"+searchPhrase+"%");
    }
}
