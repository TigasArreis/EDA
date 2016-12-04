
public class DoubleNo<E> {

    private E data;
    private DoubleNo next;
    private DoubleNo prev;

    public DoubleNo(E data) {
        this.data = data;
    }

    public DoubleNo getNext() {
		return next;
	}

	public void setNext(DoubleNo next) {
		this.next = next;
	}

	public DoubleNo getPrev() {
		return prev;
	}

	public void setPrev(DoubleNo prev) {
		this.prev = prev;
	}

	public void displayNode() {
        System.out.print(data + " ");
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

