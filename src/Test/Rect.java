package Test;

public class Rect extends Shape {
	
	public Rect() {
		//super(); <-쓰지 않아도 기본적으로 호출된다.
		
	}
	
	public Rect(int l, int u, int r, int d) {
		//super(l,u,r,d);
		super(l,u,r,d);
	}

	public Rect(Point leftUp, Point rightDown) {
		super(leftUp, rightDown);
	}
	public Rect(Rect r) {
		super((Shape)r);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("사각형입니다.");
	}
	
	
}
