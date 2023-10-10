package pack2;

public class StackT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayStack sta = new ArrayStack(7);
		sta.push(5);
		sta.push(15);
		sta.push(4);
		sta.push(343);
		sta.push(1);
		sta.push(9);
		System.out.println(sta.size());
		sta.pop();
		sta.pop();
		sta.push(12345678);
		sta.printing();
	}

}
