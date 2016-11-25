
public class QueueClass<E> implements Queue<E> {

	
	private E[] data; //lista
	private int f; // index do primeiro elemento
	private int size; //numero de elementos
	
	public QueueClass(){
		int CAPACITY = 100;
	}
	public QueueClass(int capacity){
		data = (E[]) new Object[capacity];
	}
	@Override
	public void enqueue(E o) throws IllegalStateException {
		if(size == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + size) % data.length;
		data[avail] = o;
		size++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public E front() {
		// TODO Auto-generated method stub
		if(empty()==false){
			return data[f];
			
		}
		else return null;
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(empty() == true) return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		size--;
		return answer;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		
		if(size==0){return true;}
		else{return false;}
	}
	public void displayQueue() {
		// TODO Auto-generated method stub
		for(int i = 0;i< size;){
			System.out.println(data[((f+i) % data.length)]);
			i++;
		}
	}

}
