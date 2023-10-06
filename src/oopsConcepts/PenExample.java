package oopsConcepts;

class Pen {
	String color;
	String type;

	public void write() {
		System.out.println("write something");
	}
}
public class PenExample {
	public static void main(String args[]) {
		Pen pen1 = new Pen();
		pen1.color = "black";
		pen1.type = "ballpen";
		pen1.write();
	}
}
