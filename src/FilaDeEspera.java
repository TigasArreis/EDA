
public interface FilaDeEspera <T> {

	int size();
	
	int maxSize();
	
	int places();
	
	boolean isFull();
	
	boolean isEmpty();
	
	void add(T element);
	
	void front();
	
	void remove(int posicao);
	
	String toString();
	
	
}
