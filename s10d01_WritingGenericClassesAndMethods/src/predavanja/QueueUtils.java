package predavanja;

import java.util.LinkedList;

public class QueueUtils {
	public static<E> void enqueueString(LinkedList<E> queue, E el) {
		queue.add(0, el);
	}
	
	public static<E> E dequeueString(LinkedList<E> queue) {
		return queue.remove(queue.size() - 1);
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> strQueue = new LinkedList<String>();
		QueueUtils.enqueueString(strQueue, "A");
		QueueUtils.enqueueString(strQueue, "B");
		QueueUtils.enqueueString(strQueue, "C");
		
		while(strQueue.size() > 0) {
			System.out.println(QueueUtils.dequeueString(strQueue));
		}
	}

}
