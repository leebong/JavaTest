package Test;

public class Main {

	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Ellipse e1 = new Ellipse();
		System.out.println("1. ����Ʈ ������ ȣ��");
		e1.print();
		System.out.println("2. ����4�� ������ ȣ��");
		Ellipse e2 = new Ellipse(0,0,-5,5);
		e2.print();
		System.out.println("3. ���� ������ ȣ��");
		Ellipse e3 = new Ellipse(new Point(0,0),
					new Point(10,10));
		e3.print();
		System.out.println("4. ���� ������ ȣ��");
		Ellipse e4 = new Ellipse(e3);
		e4.print();
		
		System.out.println("5. �簢�� �̵� ���������� 10," + "�Ʒ��� 10");
		e4.move(10, -10);
		e4.print();
		
		System.out.println("6. ���� 6, ���� 4�� �簢��");
		e4.resize(6, 4);
		e4.print();
		
		
		/*Point pt1 = new Point(1,2);
		Point pt2 = new Point(pt1);
		pt1.print();
		pt2.print();
		Point pt3 = pt2;//.getLocation(); // pt2; �� ���� �Ѱ��ٶ��� �ּҰ���  
		pt3.print();
		pt3.move(10, 1);
		pt3.print();
		pt3.translate(1, 1);
		pt3.print();
		System.out.println("pt2�� Ȯ��");
		pt2.print();*/
		
		
				
	}

}
