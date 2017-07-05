package gs1.str333;

import java.lang.reflect.Method;
import java.util.Scanner;

import gs1.str333.annotation.AnnotationService;
import gs1.str333.annotation.SelectAnnotation;

/**
 * 
 * @author str333
 * @date 2017. 6. 17.
 */
public class ManageForm {

	private AnnotationService annotationService;

	public void getManageForm() {

		Integer number;
		Scanner sc = new Scanner(System.in);
		Method[] methodList = AnnotationService.class.getDeclaredMethods();

		annotationService = new AnnotationService();

		while (true) {
			System.out.println("=======================================");
			System.out.println("1. 사원 등록");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 사원 전체 조회");
			System.out.println("5. 사원 검색(이름 기준)");

			System.out.print("숫자 입력 : ");

			Boolean numberCk = false;
			if (!sc.hasNextInt()) {
				System.out.println("error : input number");
				continue;
			}
			number = sc.nextInt();
			// selectNumber(number);
			numberCk = false;

			SelectAnnotation selectAnnotation = null;

			for (Method m : methodList) {
				if (m.getAnnotation(SelectAnnotation.class) == null) {
					continue;
				}
				selectAnnotation = m.getAnnotation(SelectAnnotation.class);

				if (selectAnnotation.number() == number) {
					numberCk = true;
					try {
						m.invoke(annotationService);
						break;
					} catch (Exception e) {
						continue;
					}
				}
			}
			if (!numberCk) {
				System.out.println("error : input 1~5 value");
			}
		}
	}
}
