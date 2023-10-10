package pack2;

public class ArrayStack {

	protected int capacity;
	public static final int CAPACITY = 10;
	protected int[] stackarray;
	protected int topPos = -1;
	
	public ArrayStack() {
		capacity = CAPACITY;
	}
	
	public ArrayStack(int cp) {
		capacity = cp;
		stackarray = new int[capacity];
	}
	public int size() {
		return topPos+1;
	}
	
	public void push(int mydt) throws Exception {
		if(size() == capacity) {
			System.out.println("error");
			throw new Exception("your stack is full");
		}
		stackarray[++topPos] = mydt;
	}
	public boolean isEmpty() {
		return(topPos < 0);
	}
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("your stack is Empty");
		}
		return stackarray[topPos];
	}
	public int pop() throws Exception{
		int mydata;
		if(isEmpty()) {
			throw new Exception("your stack is Empty");
		}
		mydata = stackarray[topPos] = Integer.MIN_VALUE;
		return  mydata;
	}
	
	public void printing() {
		for(int i=0; i < stackarray.length; i++) {
			System.out.println(stackarray[i] + " ");
		}
	}
	
	
}
