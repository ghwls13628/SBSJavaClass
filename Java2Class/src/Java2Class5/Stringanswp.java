package Java2Class5;

public class Stringanswp {

	
	
	
	public static void main(String[] args) {
	//String 
	//중간삽입된 -를 빼고 출력해라
		String str1 = "990925-1012999";
		String str2 = str1.substring(0,6) + str1.substring(8,14);
		System.out.println(str2);
		
		
	//Stringbuilder 클래스를 활용하여 빈번한 문자열의 생성이 발생하지 않도록 해야한다.
		StringBuilder str3 = new StringBuilder(990925);
		str3.append('-');
		str3.append(1012999);
		System.out.println(str3.toString());
		
		
		
		

	}

}
