package Test;

public class Shape {
	
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
	
	
	//3. »ý¼ºÀÚ
	public Shape() {
		this(0,0,10,10);
	}
	
	public Shape(int left, int up, int right, int down) {
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
	
	public Shape(Point leftUp, Point rightDown) {
		this((int)leftUp.getX(), (int)leftUp.getY(), 
				(int)rightDown.getX(), (int)rightDown.getY());
	
	}
	
	public Shape(Shape e) {
		this((int)e.leftUp.getX(), (int)e.leftUp.getY(), 
				(int)e.rightDown.getX(), (int)e.rightDown.getY());
		
	}
	
	public void calWidth() {
		width = (int)(rightDown.getX() - leftUp.getX());		
	}
			
	public void calHeight() {
		height = (int)(leftUp.getY() - rightDown.getY());		
	}
	

}
