package gs1.minho.service;

import gs1.minho.annotation.RegisterAnnotation;
import gs1.minho.exception.AlreadyExistingEmployeeException;
import gs1.minho.model.EmployeeDao;
import gs1.minho.request.RegisterRequest;
import gs1.minho.model.Emplyee;

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

    @RegisterAnnotation(name = "저장소에 사원을 등록하는 method 입니다", serviceMethod = "Register")
    public Emplyee register(RegisterRequest request) {
        Emplyee employee = employeeDao.searchByName(request.getName());
        if(employee != null) {
            throw new AlreadyExistingEmployeeException(request.getName() + " 님 은 등록된 상태입니다.");
        }
        Emplyee newEmployee = new Emplyee(request.getName(), request.getPosition());
        employeeDao.insert(newEmployee);
        return newEmployee;
    }

    public Map<String, Emplyee> getEmployees(RegisterRequest request) {
        return employeeDao.getEmployeeMap();
    }
}
