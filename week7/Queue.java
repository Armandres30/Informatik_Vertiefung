package woche7;

import java.util.LinkedList;

public class Queue<T> {

	private LinkedList<T> list;

		public Queue() {
			list = new LinkedList<T>();
	}
		
		public void enqueue(T x){
		list.addLast(x);
	}
	
	public T dequeue(){ 
		if (list.pollFirst()!= null) {
			return list.pollFirst();
		} else {
			return null;
		}
	}
	
	public T peek(){
		return list.getFirst();
	}

}
