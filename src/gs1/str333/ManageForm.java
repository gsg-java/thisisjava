package gs1.str333;

import java.util.Scanner;

public class ManageForm {
	public void getManageForm() {

		Integer number;
		Scanner sc = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성

		while (true) {
			System.out.println("=======================================");
			System.out.println("1. 사원 등록");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 사원 전체 조회");
			System.out.println("5. 사원 검색(이름 기준)");

			System.out.print("숫자 입력 : ");
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				selectNumber(number);
			} else {
				sc.nextLine();
				System.out.println("숫자를 입력.");
			}

		}
	}

	private void selectNumber(int number) {

		switch (number) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("1 ~ 5 선택.");
			break;
		}
	}
}
