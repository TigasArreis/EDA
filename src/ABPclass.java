
public class ABPclass<E extends Comparable<? super E>> implements ABP<E>{
	
	NoABP<E> root; //= new NoABP<E> ();
	
	ABPclass(){
		//root = new NoABP<E>();
	}
	
	@Override
	public boolean isEmpty() {
		if(root!= null){return false;}
		else{
			return true;}
	}

	@Override
	public boolean contains(E x) {
		return contains(x,root);
	}
	
	public boolean contains(E x,NoABP<E> n){
		if(n==null)
			return false;
		else{
			if (n.element.compareTo(x)>0){
				return contains(x,n.left);
			}else{
				if(n.element.compareTo(x)<0){
					return contains(x,n.right);
				}
				else{
					return true;
				}
			}
		}
	}

	@Override
	public E findMin() {
		if (isEmpty()==true){
			return null;}
		return findMin(root);
	}
	public E findMin(NoABP<E> n){
		if(n.left==null)
			return n.element;
		else
			return findMin(n.left);
			
	}

	@Override
	public E findMax() {
		if (isEmpty())
			return null;
		return findMax(root);
	}
	public E findMax(NoABP<E> n){
		if(n.right==null)
			return n.element;
		else
			return findMax(n.right);
	}

	@Override
	public void insere(E x) {
		if(isEmpty()==true){
			root = new NoABP<E>(x,null,null);
		}else{
			insere(x,root);
		}
	}
	public NoABP<E> insere(E x,NoABP<E> n){
		if( n == null){
			n = new NoABP<E>(x,null,null);}
		else if(n.element.compareTo(x)>0){
			n.left= insere(x,n.left);
		}
		else if(n.element.compareTo(x)<0){
			n.right= insere(x,n.right);
		}
		return n;
	}

	@Override
	public void remove(E x) {
		//ver se contem o elemento , ver se nao esta vazia 
		if(isEmpty()==false){
			if(contains(x)==true){
				remove(x,root);
			}
		}
	}
	public NoABP<E> remove(E x,NoABP<E> n){
		if(n.element.compareTo(x)<0){
			n.right = remove(x, n.right);
		}else if(n.element.compareTo(x)>0 ){
			n.left = remove(x,n.left);
		}
		else if(n.left!=null && n.right!= null){ //caso de haver dois filhos
			E min = findMin(n.right);
			n.element = min;
			n.right = remove(min,n.right);
		}
		else if (n.left == null){
			n=n.right;
		}else{
			n=n.left;
		}
		return n;
	}

	@Override
	public void printEmOrdem() {
		printEmOrdem(root);
	}
	public void printEmOrdem(NoABP<E> n){
		if(n!=null){
			printEmOrdem(n.left);
			System.out.println(n.element);
			printEmOrdem(n.right);}
	}	

	public void printPosOrdem() {
		printPosOrdem(root);
	}
	public void printPosOrdem(NoABP<E> n) {
		printPosOrdem(n.left);
		printPosOrdem(n.right);
		System.out.println(n.element);
	}

	@Override
	public void printPreOrdem() {
		printPreOrdem(root);
	}
	public void printPreOrdem(NoABP<E> n) {
		System.out.println(n.element);
		printPreOrdem(n.left);
		printPreOrdem(n.right);
		
	}

}
