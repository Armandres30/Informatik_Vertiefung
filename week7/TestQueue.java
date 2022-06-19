package woche7;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue<String> list= new Queue<String>();
		
		list.enqueue("H");
		System.out.println(list.peek());
		list.enqueue("E");
		System.out.println(list.peek());
		list.enqueue("L");
		System.out.println(list.peek());
		list.enqueue("L");
		System.out.println(list.peek());
		list.enqueue("O");
		System.out.println(list.peek());
		
	
		System.out.println("Entfernen von: " + list.dequeue());
		System.out.println("Entfernen von: " + list.dequeue());
		System.out.println("Entfernen von: " + list.dequeue());
		System.out.println("Entfernen von: " + list.dequeue());
		System.out.println("Entfernen von: " + list.dequeue());
		System.out.println("Entfernen von: " + list.dequeue());
		
		System.out.println("Oben liegt: " +list.peek());

	}

}
