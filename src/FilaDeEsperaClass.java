import java.util.ArrayList;

public class FilaDeEsperaClass<T> { //implements FilaDeEspera {
	
	int maxSize;
	
	ArrayList <T> lista = new ArrayList<>();
	
	
	public FilaDeEsperaClass(int tamanho){
		ArrayList lista = new ArrayList(tamanho);
		maxSize = tamanho;
	}
	
	//@Override
	public int size() {
		return lista.size();
	}
	
	//@Override
	public int maxSize() {
		// TODO Auto-generated method stub
		return maxSize;
	}

	//@Override
	public int places() {
		// TODO Auto-generated method stub
		return (maxSize-lista.size());
	}

	//@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (maxSize <= lista.size()){
			return false;
		}else{
			return true;
		}
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return lista.isEmpty();
	}

	public void add(T element) {
		// TODO Auto-generated method stub
		lista.add((T) element);
	}

	//@Override
	public void front(T element) {
		// TODO Auto-generated method stub
		lista.add(0,(T) element); 
	}

	//@Override
	public void remove(int posicao) {
		// TODO Auto-generated method stub
		lista.remove(posicao);
	}
	public String toString(){
	       return lista.toString();
	}


}
