package Java2Class4;

public class StringClass {
/*
	String �ν��Ͻ� ������ �� ���� ���
	
	String str1 = new String("Simple String");
	String str2 = "The Best String"  >>�ν��Ͻ��� �����ǰ� ���ڿ��� String�ν��Ͻ��� str2�� ����Ű�Եȴ�.
	�Ѵ� String�ν��Ͻ��� �������� �̾����� �� ��� �ν��Ͻ��� ���� ���� ��ȯ�ȴ�.
	
	
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
		//str1�� str2�� ������ str3�� str4�� �����ʴ�. 
		
		/*
		String �ν��Ͻ��� immutable�ν��Ͻ��̴�  >> �����Ǵ� �ν��Ͻ��� ���� �ּ�ȭ�Ѵ� >>�ѹ�����Ǹ� �ٸ������� �ٲܼ�����.
		
		String str1 = "Simple String"
		String str2 = "Simple String"
		�̶�� ��� str2�� �θ��� str1�� �����ͼ� �ο��Ѵ�
		*/
	}

	
	
}
