package Java2Class4;

public class methodOverloading {
	/*
	�޼ҵ� �����ε�
	-ȣ��� �޼ҵ带 ã�� �� �����ϰ� �Ǵ� �� ���� ����
	-�޼ҵ� �̸�    
	-�޼ҵ��� �Ű����� ���� >> �޼ҵ��� �̸��̰��Ƶ� ���Ǻ������� int�� double���� ���³� ���º����� ���������� �޼ҵ����ǰ� �����ϰ��Ѵ�
	���� �� �� �� �ϳ��� ���°� �ٸ� �޼ҵ带 �����ϴ� ���� �����ϴ�.
	*/
	class MyHome{ 
		void mysimpleRoom(int n1) {}
		void mysimpleRoom(int n1,int n2) {}
		void mysimpleRoom(double d1, double d2) {}
		
		//int mysimpleRoom() {}       >>  ��ȯ���� �޼ҵ� �����ε��� ������ �ƴϴ� 
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
	}  //�ָŸ�ȣ�� ��Ȳ�� ���´� ����� �� �޼ҵ尡 ȣ��ȴ� int��
	*/
	
	
	
}
