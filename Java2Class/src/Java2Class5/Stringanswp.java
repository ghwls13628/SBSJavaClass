package Java2Class5;

public class Stringanswp {

	
	
	
	public static void main(String[] args) {
	//String 
	//�߰����Ե� -�� ���� ����ض�
		String str1 = "990925-1012999";
		String str2 = str1.substring(0,6) + str1.substring(8,14);
		System.out.println(str2);
		
		
	//Stringbuilder Ŭ������ Ȱ���Ͽ� ����� ���ڿ��� ������ �߻����� �ʵ��� �ؾ��Ѵ�.
		StringBuilder str3 = new StringBuilder(990925);
		str3.append('-');
		str3.append(1012999);
		System.out.println(str3.toString());
		
		
		
		

	}

}