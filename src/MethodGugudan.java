
public class MethodGugudan {
	// 입력값 메소드, 출력값 메소드 등을 따로 생성
	// 출력없이 입력만 할 때 -> void 사용
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] arg) {
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
