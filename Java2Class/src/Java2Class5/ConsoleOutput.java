package Java2Class5;
import java.util.Scanner;
public class ConsoleOutput {

	/*
	콘솔출력
	
	//toString 메소드
	class Box{
		private String conts;
		
		Box(String cont){
			this.cont;
		}
		public String toString() {
			return conts; //문자열반환
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
	
	//문자열의 조합 printf 메소드
	/*
	printf는 문자열을 서식지정자로 표시한다
	%d 10진수
	%o 8진수
	%x 16진수
	%f 실수
	%e e 표기법 기반의 실수
	%g 출력의 대상에따라 %e 또는 %f출력
	%s 문자열 출력
	%c 문자 출력
	*/
	
	/*
	콘솔 입력
	
	Scanner 클래스
	Scanner클래스의 인스턴스 생성은 데이터를 뽑아올 대상과 연결을 의미한다. 연결 후에는 데이터 스캔(데이터의 종류나 성격에 맞춰서)이 가능하다.
	
	public static void main(String[] args){
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt(); //int형 데이터 추출 //1이 스캔됨
		int num2 = sc.nextInt(); //int형 데이터 추출 //2가 스캔됨
		int num3 = sc.nextInt(); //int형 데이터 추출 //3이 스캔됨
		
		int sum = num1 + num2 + num3;
		System.out.println("%d + %d + %d = %d \n", num1, num2, num3, sum);
	}
	*/

	//Scanner클래스의 키보드 적용
/*
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt(); 
		int num3 = sc.nextInt(); 
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);	
	}
	//Scanner 인스턴스 생성 이후에 데이터를 스캔하는 방법에 있어서는 차이가 없다 즉
	//연결 대상에 의존적이지 않은 코드의 작성이 가능하다.
*/
	
/*
	//Scanner 클래스의 주요 메소드들
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str1 = sc.nextLine();
	
		System.out.println("문자열 입력 : ");
		String str2 = sc.nextLine();
	
		System.out.printf("입력된 문자열 1 : %s \n", str1);
		System.out.printf("입력된 문자열 2 : %s \n", str2);
	}
*/
}
