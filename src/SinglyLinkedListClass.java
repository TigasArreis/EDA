import java.util.Iterator;

public class SinglyLinkedListClass<T> implements SinglyLinkedList<T> {
	
	
	
	SingleNode<T> header,tail;
	int size;
	
	public SinglyLinkedListClass(){
		header = tail = new SingleNode<T>();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}
	public SingleNode<T> header(){
		return header;
	}
	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(T x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void add(int i, T x) {
		SingleNode<T> holder;
		java.util.Iterator<T> iterador =new SinglyLinkedListIterator<T>(this.header.next);
		for(int j=0;j>i;i++){
			holder = iterador.next();
		}
	}
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set(int i, Object y) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void add(T x) {
		add(tail,x);
	}
	public void add(SingleNode<T> prev,T x){
		SingleNode<T> newNode = new SingleNode<T>(x,prev.getNext());
		prev.setNext(newNode);
		tail = newNode;
		size++;
	}
}
