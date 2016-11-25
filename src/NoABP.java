
public class NoABP<E> {

	E element;
	NoABP<E> left,right;
	boolean leave;
	
	NoABP(){
		element = null;
		left = null;
		right =null;	
	}
	NoABP(E e,NoABP<E> left,NoABP<E> right){
		element = e;
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		return (String) element;
	}
	
	
	
}
