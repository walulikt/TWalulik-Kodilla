package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    SearchingFacade searchingFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void companySearchTest(){
        //Given
        Company testCompany= new Company("This test comp");
        //When
        companyDao.save(testCompany);
        //Then
        Assert.assertEquals(1,searchingFacade.companySearch("test").size());
        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }

    @Test
    public void employeeSearchTest(){
        //Given
        Employee testEmp= new Employee("FirstName", "TestLastName");
        //When
        employeeDao.save(testEmp);
        //Then
        Assert.assertEquals(1,searchingFacade.employeeSearch("Test").size());
        //CleanUp
        employeeDao.deleteAll();
    }

}
