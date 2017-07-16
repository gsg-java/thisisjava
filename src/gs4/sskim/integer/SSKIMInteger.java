package gs4.sskim.integer;

public class SSKIMInteger{
	
	public final int value;
	
	public SSKIMInteger(int value){
		this.value = value;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return 최대 값
	 */
	public static int max(int a, int b){
		return Math.max(a, b);
	}
	
	/**
	 * @param a
	 * @param b
	 * @return 최소 값
	 */
	public static int min(int a, int b){
		return (a <= b) ?  a : b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return 더하기 값
	 */
	public static int sum(int a, int b){
		return a + b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return 첫 번째 인자값이 더 크면 -1 반환 두번째 인자값이 더 크면 1 반환
	 */
	public static int compare(int a, int b){
		//두 값이 같으면 0 반환
		if(a == b)
			return 0;
		return (a < b) ? -1 : 1;
	}
	
	/**
	 * @param str
	 * @return 보류보류
	 */
	public static int parseInt(String str){
		int count = 0;
		int length = str.length();
		String zero = str.substring(0, 1);

		//TODO 앞자리가 0이면 0을 제거해야됨 but 근대 앞에 0이 여러개 일수가 있으니까 그것에 대한 처리를 해줘야 한다.
		if(zero.equals("0")){
			for(int i=0; i<length; i++){
				if(str.substring(i, i+1).equals("0")){
					count++;
				}
			}
		}
		String noZeroStr = str.substring(count, str.length());
		System.out.println("결과값:"+noZeroStr);
		//TODO 이 결과값을 숫자로 바꿔야한다.
		int noZeroLength = noZeroStr.length();
		int result = 0;
		//보류

		return 0;
	}
}
