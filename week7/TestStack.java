package woche7;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<String> list= new Stack<String>();
		
		list.push("H");
		System.out.println(list.top());
		list.push("E");
		System.out.println(list.top());
		list.push("L");
		System.out.println(list.top());
		list.push("L");
		System.out.println(list.top());
		list.push("O");
		System.out.println(list.top());
		
	
		System.out.println("Entfernen von: " + list.pop());
		System.out.println("Entfernen von: " + list.pop());
		System.out.println("Entfernen von: " + list.pop());
		System.out.println("Entfernen von: " + list.pop());
		System.out.println("Entfernen von: " + list.pop());
		System.out.println("Entfernen von: " + list.pop());
		
		System.out.println("Oben liegt: " +list.top());

		

	}

}
