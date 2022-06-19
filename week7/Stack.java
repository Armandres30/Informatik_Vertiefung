package woche7;

import java.util.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> list;
	
	public Stack() {
		list = new LinkedList<T>();
	}
	
	public void push(T x){ 
		list.addFirst(x);
	}
	
	public T pop(){
		
		if (list.pollFirst() != null) {
			return list.pollFirst();
		} else {
			return null;
		}
		
	}
	
	public T top(){
		return list.getFirst();
	}
	
}

	
