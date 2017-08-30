package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("FL");
		queue.add("NY");
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.remove());


		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			for (String s : queue) {
				System.out.println(s);


			}

		}
	}
}
