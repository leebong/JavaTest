package Test;

public class Point {
	//1. ��� ���� ����
	private double x;
	private double y;
	
	//2. getter�� setter : �ٸ� ����ڰ� ������ �� �ֵ��� set, get�� ����Ѵ�
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
	
	//3. �����ڵ� : �����ʱ�ȭ
	public Point() { // Default �����ڴ� �ݵ�� �־�� �Ѵ�.
		             //���� ���� �����ڴ� x,y�� 0,0 ���� �ʱ�ȭ �ȴ�		             
		//x = 0; �������� 
		//y = 0; ��������
	}
	
	public Point(double x, double y) { // x, y ���� �޴� ������
		this.setX(x); // == this.x = x; 
		this.setY(y); // == this.y = y;
	}
	
	public Point(Point p) { // ���������
		x = p.x;
		y = p.y;
	}
	
	//������2 => �� ������ �Ű������� �ϴ�
	//������3 => ��������� => Point Ŭ���� ��ü�� �Ű�������
	//4. �ʿ��� ��� = �޼ҵ��
	Point getLocation() {
		Point p = new Point(x,y);
		return p;
		// �� 2���� ����Ͽ� ��� ���� : return new Point(x,y);
	}
	
	//x, y�� ��� �������� �̵����Ѷ�
	void move(double x, double y) {
		this.setX(x); // == this.x = x;
		this.setY(y); // == this.y = y;
	}
	
	//���� ��ǥ���� x�������� dx��ŭ, y�������� dy���⸸ŭ �̵�
	void translate(int dx, int dy) {
		move(x+dx, y+dy); // ���� : x+=dx; y+=dy;
		
	}
	void print() {
		System.out.println(x + "," + y);
	}
	
	
}
