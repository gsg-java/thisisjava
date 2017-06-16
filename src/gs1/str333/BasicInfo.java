package gs1.str333;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import gs1.str333.enums.PositionEnum;
import gs1.str333.model.Employee;

/**
 * @author str333
 * @date 2017. 6. 11.
 */
public class BasicInfo {

	List<Employee> employees = new ArrayList<Employee>();

	public BasicInfo(Map<Integer, Object> map) {

		List<PositionEnum> pEnums = new ArrayList<PositionEnum>(Arrays.asList(PositionEnum.values()));

		for (PositionEnum pEnum : pEnums) {
			map.put(pEnum.getId(), pEnum);
		}

		int id = 0;
		employees.add(new Employee(++id, "name0", PositionEnum.ASSISTANT_MANAGER));
		employees.add(new Employee(++id, "name1", PositionEnum.INTERN));
		employees.add(new Employee(++id, "name2", PositionEnum.INTERN));
		employees.add(new Employee(++id, "name3", PositionEnum.MANAGER));
		employees.add(new Employee(++id, "name4", PositionEnum.ASSISTANT_MANAGER));
		employees.add(new Employee(++id, "name5", PositionEnum.DEPUTY_GENERAL_MANAGER));
		employees.add(new Employee(++id, "name6", PositionEnum.STAFF));
		employees.add(new Employee(++id, "name7", PositionEnum.MANAGER));
		employees.add(new Employee(++id, "name8", PositionEnum.ASSISTANT_MANAGER));
		employees.add(new Employee(++id, "name9", PositionEnum.INTERN));
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployees(Employee employee) {
		this.employees.add(employee);
	}

	public void delEmployees(Employee emp) {
		for (Iterator<Employee> iterator = this.employees.iterator(); iterator.hasNext();) {
			Employee e = iterator.next();
			if (e.getId() == emp.getId()) {
				iterator.remove();
				return;
			}
		}
	}

	public void editEmployees(Employee emp) {
		for (Employee e : this.employees) {
			if (e.getId().equals(emp.getId())) {
				e.setBasicSalary(emp.getBasicSalary());
				e.setPosition(emp.getPosition());
			}
		}
	}

}
