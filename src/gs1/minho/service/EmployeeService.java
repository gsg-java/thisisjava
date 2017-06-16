package gs1.minho.service;

import gs1.minho.annotation.Service;
import gs1.minho.exception.AlreadyExistEmployeeException;
import gs1.minho.exception.NotExistEmployeeException;
import gs1.minho.model.EmployeeDao;
import gs1.minho.request.DeleteRequest;
import gs1.minho.request.RegisterRequest;
import gs1.minho.model.Emplyee;
import gs1.minho.request.Request;
import gs1.minho.request.SearchByNameRequest;

import java.util.Map;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        this.employeeDao = EmployeeDao.getInstance();
    }

    @Service(method = "Register")
    public Emplyee register(Request request) {
        RegisterRequest registerRequest = (RegisterRequest)request;
        Emplyee employee = employeeDao.searchByName(registerRequest.getName());
        if(employee != null) {
            return null;
        }
        Emplyee newEmployee = new Emplyee(registerRequest.getName(), registerRequest.getPosition());
        employeeDao.insert(newEmployee);
        return newEmployee;
    }

    @Service(method = "Delete")
    public Emplyee delete(Request request) {
        DeleteRequest deleteRequest = (DeleteRequest) request;
        Emplyee employee = employeeDao.deleteEmployee(deleteRequest.getName());
        if (employee == null) {
            return null;
        }
        return employee;
    }

    @Service(method = "ShowAll")
    public Map<String, Emplyee> getEmployees(Request request) {
        if(employeeDao.getEmployeeMap().isEmpty()) return null;
        return employeeDao.getEmployeeMap();
    }

    @Service(method = "SearchByName")
    public Emplyee searchByName(Request request) {
        SearchByNameRequest searchByNameRequest = (SearchByNameRequest) request;
        Emplyee employee = employeeDao.searchByName(searchByNameRequest.getName());
        if(employee == null){
            return null;
        }
        return employeeDao.searchByName(searchByNameRequest.getName());
    }
}
