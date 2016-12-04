public class NoAB<E> {

	E element;
	NoAB<E> left;
	NoAB<E> right;
	
	NoAB(E e){
		element = e;
		left = null;
		right =null;	
	}
	NoAB(E e,NoAB<E> left,NoAB<E> right){
		element = e;
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		return String.valueOf(element);
	}
	
	
	
}
