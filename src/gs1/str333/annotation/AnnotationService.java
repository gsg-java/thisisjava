package gs1.str333.annotation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import gs1.str333.BasicInfo;
import gs1.str333.enums.PositionEnum;
import gs1.str333.model.Employee;

/**
 * 
 * @author str333
 * @date 2017. 6. 17.
 */
public class AnnotationService {

	Map<Integer, Object> map = new HashMap<Integer, Object>();
	BasicInfo bInfo = new BasicInfo(map);

	Scanner scan = new Scanner(System.in);

	@SelectAnnotation(number = 1)
	public void add() {
		for (Entry<Integer, Object> eMap : map.entrySet()) {
			System.out.print(eMap.getKey() + ". " + eMap.getValue().toString() + " / ");
		}
		int pId = 0;
		int id = 0;
		String name = null;
		System.out.println();
		System.out.println("직급 번호 입력 : ");
		if (scan.hasNextInt()) {
			pId = scan.nextInt();

			if (map.get(pId) != null) {
				System.out.println("name : ");
				if (scan.hasNext()) {
					name = scan.next();
					id = bInfo.getEmployees().stream().max((p1, p2) -> Integer.compare(p1.getId(), p2.getId())).get()
							.getId();

					bInfo.addEmployees(new Employee(++id, name, (PositionEnum) map.get(pId)));
				}
			} else {
				System.out.println("error : wrong number.");
			}
		} else {
			System.out.println("error : input number.");
		}
	}

	@SelectAnnotation(number = 2)
	public void del() {
		System.out.println("삭제 id 입력 : ");
		if (scan.hasNextInt()) {
			int id = scan.nextInt();
			Employee e = bInfo.getEmployees().stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);

			if (e == null) {
				System.out.println("error : wrong id.");
			} else {
				bInfo.delEmployees(e);
			}
		} else {
			System.out.println("error : input number.");
		}
	}

	@SelectAnnotation(number = 3)
	public void edit() {
		System.out.println("수정할 정보의 id 입력 : ");
		if (scan.hasNextInt()) {
			int id = scan.nextInt();
			Employee e = bInfo.getEmployees().stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);

			if (e == null) {
				System.out.println("error : wrong id.");
			} else {
				System.out.println("update 할 직급 번호 입력 : ");
				if (scan.hasNextInt()) {
					int pId = scan.nextInt();
					if (map.get(pId) != null) {
						PositionEnum pEnum = (PositionEnum) map.get(pId);
						e.setPosition(pEnum.getPositionName());
						e.setBasicSalary(pEnum.getBasicSalary());
						bInfo.editEmployees(e);
					} else {
						System.out.println("wrong postion id");
					}
				}
			}
		} else {
			System.out.println("error : input number.");
		}
	}

	@SelectAnnotation(number = 4)
	public void select() {
		for (Employee e : bInfo.getEmployees()) {
			System.out.println("id : " + e.getId() + ", name : " + e.getName() + ", postion : " + e.getPosition()
					+ ", salary : " + e.getBasicSalary());
		}
	}

	@SelectAnnotation(number = 5)
	public void search() {
		System.out.println("이름 검색 : ");
		if (scan.hasNext()) {
			String name = scan.next();
			Employee e = bInfo.getEmployees().stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);
			if (e == null) {
				System.out.println("error - NullPointException");
			} else {
				System.out.println("id : " + e.getId() + ", name : " + e.getName() + ", postion : " + e.getPosition()
						+ ", salary : " + e.getBasicSalary());
			}
		}
	}
}
