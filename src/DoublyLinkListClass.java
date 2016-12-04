
public class DoublyLinkListClass<E> implements DoublyLinkList<E>{

	public DoubleNo<E> first = null;
	public DoubleNo<E> last = null;
	
	public void addFisrt(E data) {
		DoubleNo<E> newNode = new DoubleNo(data);
		
		if (isEmpty()) {
			newNode.setNext(null);
			newNode.setPrev(null);
			first = newNode;
			last = newNode;
		} else {
			first.setPrev(newNode);
			
		}
	}
	
	public boolean isEmpty() {
        return (first == null);
    }
	   public void displayList() {
	        DoubleNo<E> current = first;
	        while (current != null) {
	            current.displayNode();
	            current = current.getNext();
	        }
	        System.out.println();
	    }

}
