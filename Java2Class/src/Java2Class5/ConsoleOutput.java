package Java2Class5;
import java.util.Scanner;
public class ConsoleOutput {

	/*
	�ܼ����
	
	//toString �޼ҵ�
	class Box{
		private String conts;
		
		Box(String cont){
			this.cont;
		}
		public String toString() {
			return conts; //���ڿ���ȯ
		}
	
	
		public static void main(String[] args) {
			StringBuilder stb = new StringBuilder("12");
			stb.append(34);
			System.out.println(stb.toString());
			System.out.println(stb);

			Box box = new Box("Camera");
			System.out.println(box.toString());
			System.out.println(box);
		
		//
		
		}
	}
	*/
	
	//���ڿ��� ���� printf �޼ҵ�
	/*
	printf�� ���ڿ��� ���������ڷ� ǥ���Ѵ�
	%d 10����
	%o 8����
	%x 16����
	%f �Ǽ�
	%e e ǥ��� ����� �Ǽ�
	%g ����� ��󿡵��� %e �Ǵ� %f���
	%s ���ڿ� ���
	%c ���� ���
	*/
	
	/*
	�ܼ� �Է�
	
	Scanner Ŭ����
	ScannerŬ������ �ν��Ͻ� ������ �����͸� �̾ƿ� ���� ������ �ǹ��Ѵ�. ���� �Ŀ��� ������ ��ĵ(�������� ������ ���ݿ� ���缭)�� �����ϴ�.
	
	public static void main(String[] args){
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt(); //int�� ������ ���� //1�� ��ĵ��
		int num2 = sc.nextInt(); //int�� ������ ���� //2�� ��ĵ��
		int num3 = sc.nextInt(); //int�� ������ ���� //3�� ��ĵ��
		
		int sum = num1 + num2 + num3;
		System.out.println("%d + %d + %d = %d \n", num1, num2, num3, sum);
	}
	*/

	//ScannerŬ������ Ű���� ����
/*
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt(); 
		int num3 = sc.nextInt(); 
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);	
	}
	//Scanner �ν��Ͻ� ���� ���Ŀ� �����͸� ��ĵ�ϴ� ����� �־�� ���̰� ���� ��
	//���� ��� ���������� ���� �ڵ��� �ۼ��� �����ϴ�.
*/
	
/*
	//Scanner Ŭ������ �ֿ� �޼ҵ��
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� : ");
		String str1 = sc.nextLine();
	
		System.out.println("���ڿ� �Է� : ");
		String str2 = sc.nextLine();
	
		System.out.printf("�Էµ� ���ڿ� 1 : %s \n", str1);
		System.out.printf("�Էµ� ���ڿ� 2 : %s \n", str2);
	}
*/
}
