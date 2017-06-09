package gs1.minho.model;

import java.util.Map;
import java.util.TreeMap;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class EmployeeDao {
    private Map<String, Emplyee> employeeMap;
    private final int MAX_EMPLOYEE_NUMBER = 100;
    private static int empId = 0;
    private static EmployeeDao instance;

    public static EmployeeDao getInstance() {
        if(instance == null) {
            instance = new EmployeeDao();
        }
        return instance;
    }

    private EmployeeDao() {
        employeeMap = new TreeMap<>();
    }

    public Emplyee insert(Emplyee employee) {
        employee.setId(++empId);
        employeeMap.put(employee.getName(), employee);
        return employee;
    }

    public Emplyee searchByName (String name) {
        return employeeMap.get(name);
    }

    public Map<String, Emplyee> getEmployeeMap() {
        return employeeMap;
    }
}
