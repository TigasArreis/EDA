
public interface Queue<E> {
	
	public void enqueue(E o); //throws  OverflowQueueException;
	
	public E front(); //throws EmptyQueueException;
	
	public E dequeue();
	
	public int size();
	
	public boolean empty();
	
	public void displayQueue();
}
