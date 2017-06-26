import java.util.Stack;

public class MyStack implements pushpop {
	
	public static void main(String x[]){
		
		pushpop y;
		y = new MyStack();
		Stack st = new Stack();
		
		System.out.println("stack: " + st);
	
		y.push(st, 3);
		y.push(st, 4);
		y.push(st, 5);
		y.pop(st);
		y.peek(st);
		y.clear(st);
		y.push(st, 10);
		
	}
	
	public void push(Stack st, int a){
		
		st.push(a);
		System.out.println("push: " + a );
		System.out.println("stack: " + st);

	}
	
	public void pop(Stack st){
		
		System.out.print("pop: ");
		int a = (Integer) st.pop();
		System.out.println( a );
		System.out.println("stack: " + st);
	}
	
	public void peek(Stack st){

		System.out.print("Peek: ");
		int a = (Integer) st.peek();
		st.peek();
		System.out.println(a);
	}
	
	public void clear(Stack st){
		
		st.clear();
		System.out.println("Clear: " + st);
	}

}
