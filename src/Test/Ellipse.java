package Test;

public class Ellipse {
	//1. 멤버변수
	private Point leftUp;
	private Point rightDown;
	private int width;
	private int height;
	
	//2. setters and getters
	public Point getLeftUp() {
		return leftUp;
	}
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getRightDown() {
		return rightDown;
	}
	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//3. 생성자
	public Ellipse() {
		this(0,0,10,10);
	}
	
	public Ellipse(int left, int up, int right, int down) {
		if(left > right) {
			int tmp = left;
			left = right;
			right = tmp;
		}
		if(up < down) {
			int tmp = up;
			up = down;
			down  = tmp;
		}
		
		leftUp = new Point(left,up);
		rightDown = new Point(right,down);
		this.calWidth();
		this.calHeight();
		
	}
	
	public Ellipse(Point leftUp, Point rightDown) {
		this((int)leftUp.getX(), (int)leftUp.getY(), 
				(int)rightDown.getX(), (int)rightDown.getY());
	
	}
	
	public Ellipse(Ellipse e) {
		this((int)e.leftUp.getX(), (int)e.leftUp.getY(), 
				(int)e.rightDown.getX(), (int)e.rightDown.getY());
		
	}
	
	//4. 필요 기능 -> 메소드
	public void resize(int width, int height) {
		if(width < 0) width = -width;
		if(height < 0) height = -height;
		this.width = width;
		this.height = height;
		rightDown.move(leftUp.getX()+width, leftUp.getY()-height);
		
	}
	
	public void move(int dx, int dy) {
		leftUp.translate(dx, dy);
		rightDown.translate(dx, dy);
		
	}
	
	public void calWidth() {
		width = (int)(rightDown.getX() - leftUp.getX());		
	}
			
	public void calHeight() {
		height = (int)(leftUp.getY() - rightDown.getY());		
	}
	
	public void print() {
		System.out.println("타원정보");
		System.out.print("좌상 점 : ");
		leftUp.print();
		System.out.print("우하 점 : ");
		rightDown.print();
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
	}
	
	
	
}
