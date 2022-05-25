package Java2Class4;

public class ConstructorOverloading {
	/*
	class person{
		private int regiNum;   // 주민번호
		private int passNum;   // 여권번호
		
		person(int rnum,int pnum){
			regiNum = rnum;
			passNum = prum;
		}
		person(int rnum){
			regiNum = rnum;
			passNum = 0;
		}
		void showPersinalInfo() {}
		
	
		public static void main(String[] args) {
			Person jung = new Person(123,456); // 위 메소드
		//	Person hong = new Person(123);   // 밑메소드
		
			jung.showPersinalInfo();
			//hong.showPersinalInfo();

		}
	}	//생성자의 오버로딩을 통해 생성되는 인스턴스의 유형을 구분할 수 있다.
	*/
	
	/*
	키워드 this를 이용한 다른 생성자의 호출
	 
	Person(int rnum) {
		this(rnum, 0);   >> Person(int rnum, 0)   위 첫번째 메소드에 호출된다.
	}rnum과 0을 인자로 받는 오버로딩 된 다른 생성자를 호출한다.(중복된 코드를 줄이는 효과를 가진다)
	
		this.rnum = ?   >>> this는 포함되있는 int rnum에 들어가는 인스턴스 변수를 의미한다.
	*/
	
	
	
	
	
}
