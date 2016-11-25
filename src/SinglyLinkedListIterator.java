
public class SinglyLinkedListIterator<E> implements java.util.Iterator<E>{

	private SingleNode<E> current;
	
	public SinglyLinkedListIterator(SingleNode<E> c){
		current = c;
	}
	
	@Override
	public boolean hasNext() {
		if(current!=null){
			return false;}
		else return true;
	}

	@Override
	public E next() {
		if (!hasNext()){
			throw new java.util.NoSuchElementException("Nao existem elementos");
		}
		else{
			E item = current.element();
			current = current.getNext();
			return item;
		}
	} 

}
