package Java2Class4;

public class StringClass {
/*
	String 인스턴스 생성의 두 가지 방법
	
	String str1 = new String("Simple String");
	String str2 = "The Best String"  >>인스턴스가 생성되고 문자열이 String인스턴스의 str2를 가르키게된다.
	둘다 String인스턴스의 생성으로 이어진고 그 결과 인스턴스의 참조 값이 반환된다.
	
	
*/
	
	public static void main(String[] args) {

		String str1 = "Simple String";
		String str2 = "Simple String";
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		
		if(str1 == str2) {
			System.out.println("o");
		}
		else {
			System.out.println("x");
		}
		
	
		if(str3 == str4) {
			System.out.println("o");
		}
		else {	
			System.out.println("x");
		}
		//str1과 str2는 같지만 str3와 str4는 같지않다. 
		
		/*
		String 인스턴스는 immutable인스턴스이다  >> 생성되는 인스턴스의 수를 최소화한다 >>한번선언되면 다른값으로 바꿀수없다.
		
		String str1 = "Simple String"
		String str2 = "Simple String"
		이라고 적어도 str2를 부르면 str1을 가져와서 부여한다
		*/
	}

	
	
}
