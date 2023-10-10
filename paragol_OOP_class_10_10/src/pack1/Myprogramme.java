package pack1;

import java.util.Stack;

public class Myprogramme {
	
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		names.push("Paragol_1");
		names.push("Paragol_2");
		names.push("Paragol_3");
		names.push("Paragol_4");
		names.push("Paragol_5");
		System.out.println(names);
		names.pop();
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names.search("Paragol_4"));
		System.out.println(names.size());
		
	}

}
