package gs1.str333.model;

import java.io.Serializable;

/**
 * @author str333
 * @date 2017. 6. 11.
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = -6094493184450427101L;

	private String name;
	private String position;
	private String gender;
	private Integer basicSalary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * 생성자
	 */
	public Employee() {
		super();
	}

	/**
	 * 생성자
	 * 
	 * @param name
	 * @param position
	 * @param gender
	 */
	public Employee(String name, String position, String gender, Integer basicSalary) {
		super();
		this.name = name;
		this.position = position;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", gender=" + gender + ", basicSalary="
				+ basicSalary + "]";
	}

}
