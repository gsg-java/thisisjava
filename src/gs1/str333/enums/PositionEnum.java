package gs1.str333.enums;

/**
 * @author str333
 * @date 2017. 6. 11.
 */
public enum PositionEnum {
	// INTERN, STAFF, ASSISTANT_MANAGER, MANAGER,
	// DEPUTY_GENERAL_MANAGER, GENERAL_MANAGER

	INTERN(1, 2600, "인턴"), STAFF(2, 3500, "사원"), ASSISTANT_MANAGER(3, 4500, "대리"), MANAGER(4, 6000,
			"과장"), DEPUTY_GENERAL_MANAGER(5, 7500, "차장"), GENERAL_MANAGER(6, 9900, "부장");

	private final int id;
	private final int basicSalary;
	private final String positionName;

	private PositionEnum(int id, int basicSalary, String positionName) {
		this.id = id;
		this.basicSalary = basicSalary;
		this.positionName = positionName;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public int getId() {
		return id;
	}

	public String getPositionName() {
		return positionName;
	}

}
