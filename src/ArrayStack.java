
public class ArrayStack <E> implements Stack<E> {

	public static int CAPACITY;
	private int t = -1;
	private E[] data;
	
	
	public ArrayStack() {
		CAPACITY = 100;
	}
	public ArrayStack( int capacity){
		data = (E[]) new Object[capacity];
	}
	@Override
	public int size() {
		return(t +1);
	}
	public boolean isEmpty() {
		if(t == -1){return true;
	}
		else { return false; }

	}	
	
	@Override
	public void push(E element) throws IllegalStateException  {
		if( size() == data.length){ 
		throw new IllegalStateException ("Stack is Full");
		}
		else{
			t++;
			data[t]= element;}
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty() == true) {
			return null;
			}
		E poped = data[t];
		data[t] = null;
		t--;
		return poped;
	}

	@Override
	public E top() {
		if (isEmpty()==true){
			return null;
		}
		return data[t];
	}
	public void display() {
		for(int i = t;i>=0;i--){
			System.out.print(data[i]);
			
		}
	}
}
