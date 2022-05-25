package Java2Class4;

public class methodOverloading {
	/*
	메소드 오버로딩
	-호출된 메소드를 찾을 때 참조하게 되는 두 가지 정보
	-메소드 이름    
	-메소드의 매개변수 정보 >> 메소드의 이름이같아도 맥의변수선언 int나 double같은 형태나 나온변수의 개수에따라 메소드정의가 가능하게한다
	따라서 이 둘 중 하나의 형태가 다른 메소드를 정의하는 것이 가능하다.
	*/
	class MyHome{ 
		void mysimpleRoom(int n1) {}
		void mysimpleRoom(int n1,int n2) {}
		void mysimpleRoom(double d1, double d2) {}
		
		//int mysimpleRoom() {}       >>  반환형은 메소드 오버로딩의 조건이 아니다 
 		//double mysimpleRoom() {}    >>
	}
	
	class AAA{
		void simple(int p1,int p2) {}
		void simple(double p1,double p2) {}
		
	}
	/*
	public static void main(String[] args) {
		AAA inst = new AAA();
		inst.simple(7, 'k');   
	}  //애매모호한 상황이 나온다 결과는 위 메소드가 호출된다 int라서
	*/
	
	
	
}
