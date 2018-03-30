package Test;

public class Point {
	//1. 멤버 변수 설정
	private double x;
	private double y;
	
	//2. getter와 setter : 다른 사용자가 접근할 수 있도록 set, get을 사용한다
	public double getX() { 
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//3. 생성자들 : 변수초기화
	public Point() { // Default 생성자는 반드시 있어야 한다.
		             //값이 없는 생성자는 x,y는 0,0 으로 초기화 된다		             
		//x = 0; 생략가능 
		//y = 0; 생략가능
	}
	
	public Point(double x, double y) { // x, y 값을 받는 생성자
		this.setX(x); // == this.x = x; 
		this.setY(y); // == this.y = y;
	}
	
	public Point(Point p) { // 복사생성자
		x = p.x;
		y = p.y;
	}
	
	//생성자2 => 두 정수를 매개변수로 하는
	//생성자3 => 복사생성자 => Point 클래스 객체를 매개변수로
	//4. 필요한 기능 = 메소드들
	Point getLocation() {
		Point p = new Point(x,y);
		return p;
		// 위 2줄을 축약하여 사용 가능 : return new Point(x,y);
	}
	
	//x, y로 멤버 변수들을 이동시켜라
	void move(double x, double y) {
		this.setX(x); // == this.x = x;
		this.setY(y); // == this.y = y;
	}
	
	//기존 좌표에서 x방향으로 dx만큼, y방향으로 dy방향만큼 이동
	void translate(int dx, int dy) {
		move(x+dx, y+dy); // 같음 : x+=dx; y+=dy;
		
	}
	void print() {
		System.out.println(x + "," + y);
	}
	
	
}
