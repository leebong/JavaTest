package Test;

public class Main {

	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Ellipse e1 = new Ellipse();
		System.out.println("1. 디폴트 생성자 호출");
		e1.print();
		System.out.println("2. 정수4개 생성자 호출");
		Ellipse e2 = new Ellipse(0,0,-5,5);
		e2.print();
		System.out.println("3. 두점 생성자 호출");
		Ellipse e3 = new Ellipse(new Point(0,0),
					new Point(10,10));
		e3.print();
		System.out.println("4. 복사 생성자 호출");
		Ellipse e4 = new Ellipse(e3);
		e4.print();
		
		System.out.println("5. 사각형 이동 오른쪽으로 10," + "아래로 10");
		e4.move(10, -10);
		e4.print();
		
		System.out.println("6. 가로 6, 세로 4인 사각형");
		e4.resize(6, 4);
		e4.print();
		
		
		/*Point pt1 = new Point(1,2);
		Point pt2 = new Point(pt1);
		pt1.print();
		pt2.print();
		Point pt3 = pt2;//.getLocation(); // pt2; 로 값을 넘겨줄때는 주소값을  
		pt3.print();
		pt3.move(10, 1);
		pt3.print();
		pt3.translate(1, 1);
		pt3.print();
		System.out.println("pt2값 확인");
		pt2.print();*/
		
		
				
	}

}
