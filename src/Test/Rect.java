package Test;

public class Rect extends Shape {
	
	public Rect() {
		//super(); <-���� �ʾƵ� �⺻������ ȣ��ȴ�.
		
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
		System.out.println("�簢���Դϴ�.");
	}
	
	
}
