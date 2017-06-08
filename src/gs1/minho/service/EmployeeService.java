package gs1.minho.service;

import gs1.minho.annotation.Service;
import gs1.minho.exception.AlreadyExistingEmployeeException;
import gs1.minho.model.EmployeeDao;
import gs1.minho.request.RegisterRequest;
import gs1.minho.model.Emplyee;
import gs1.minho.request.Request;
import gs1.minho.request.ShowAllRequest;

import java.util.Map;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        this.employeeDao = EmployeeDao.getGetInstane();
    }

    @Service(method = "Register")
    public Emplyee register(Request request) {
        RegisterRequest registerRequest = (RegisterRequest)request;
        Emplyee employee = employeeDao.searchByName(registerRequest.getName());
        if(employee != null) {
            throw new AlreadyExistingEmployeeException(registerRequest.getName() + " 님 은 등록된 상태입니다.");
        }
        Emplyee newEmployee = new Emplyee(registerRequest.getName(), registerRequest.getPosition());
        employeeDao.insert(newEmployee);
        return newEmployee;
    }

    @Service(method = "ShowAll")
    public Map<String, Emplyee> getEmployees(Request request) {
        return employeeDao.getEmployeeMap();
    }
}
