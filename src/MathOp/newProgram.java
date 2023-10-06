package MathOp;
import java.util.LinkedList;

public class newProgram {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		LinkedList<Integer> newObj=new LinkedList<>();

		obj.add(6);
		obj.add(8);
		obj.add(10);
		obj.add(4);
		obj.add(2);
		obj.add(1);
		obj.add(40);
		System.out.println(obj);//6,8,10,4,2,1
		for(int i=obj.size()-1;i>2;i--) { //size=6
			int first = obj.pollLast();
			int second = obj.peek();

			if(first>second){
				newObj.add(first);
			}
			else if (second > first) {
				newObj.add(second);
			}
			else{

			}
		}
		System.out.println(newObj);
	}
}
