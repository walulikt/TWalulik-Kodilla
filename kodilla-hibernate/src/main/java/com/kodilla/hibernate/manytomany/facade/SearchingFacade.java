package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Company> companySearch (String partOfTheCompaniesName) {
        List<Company> companiesFound = companyDao.searchCompanyByElement(partOfTheCompaniesName);
        LOGGER.info("Start searching companies with '" + partOfTheCompaniesName+ "' in their name.");
       try{
           if (companiesFound.size()==0){
               LOGGER.error(SearchingException.ERR_COMPANY_NOT_FOUND);
                throw new SearchingException();
           }} catch (SearchingException e) {
          System.out.println(SearchingException.ERR_COMPANY_NOT_FOUND);
       }
        return companiesFound;
    }

    public List<Employee> employeeSearch (String partOfTheEmployeesName) {
        List<Employee> employeesFound = employeeDao.searchEmployeeByElement(partOfTheEmployeesName);
        LOGGER.info("Start searching employees with '" + partOfTheEmployeesName+ "' in their name.");
        try{
            if (employeesFound.size()==0){
                LOGGER.error(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
                throw  new SearchingException();
            }} catch (SearchingException e) {
            System.out.println(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employeesFound;
    }
}
