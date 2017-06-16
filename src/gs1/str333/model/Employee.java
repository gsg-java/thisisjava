package gs1.str333.model;

import java.io.Serializable;

import gs1.str333.enums.PositionEnum;

/**
 * @author str333
 * @date 2017. 6. 11.
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = -6094493184450427101L;

	private Integer id;
	private String name;
	private String position;
	private Integer basicSalary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	public Employee(Integer id, String name, String position, Integer basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.basicSalary = basicSalary;
	}

	/**
	 * 생성자
	 * 
	 * @param name
	 * @param pEnum
	 */
	public Employee(Integer id, String name, PositionEnum pEnum) {
		super();
		this.id = id;
		this.name = name;
		this.position = pEnum.getPositionName();
		this.basicSalary = pEnum.getBasicSalary();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", basicSalary=" + basicSalary
				+ "]";
	}

}
