
public class ABclass<E> implements AB<E>{
	
	NoAB<E> root;
	public ABclass(){
		
	}
	
	public ABclass(NoAB<E> root){
		this.root =root;
	}
	
	@Override
	public boolean isEmpty() {
		if(root!= null){return false;}
		else{
			return true;}
	}
	

	

	@Override
	public void insere(E x) {
		if(isEmpty()==true){
			root = new NoAB<E>(x,null,null);
		}else{
			insere(x,root);
		}
	}
		
	public NoAB<E> insere(E x,NoAB<E> n){
		if( n == null){
			n = new NoAB<E>(x,null,null);}
		else if(n.left==null){
			n.left= insere(x,n.left);
		}
		else if(n.right==null){
			n.right= insere(x,n.right);
		}
		return n;
	}

	@Override
	public void remove(E x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printEmOrdem() {
		printEmOrdem(root);
	}
	public void printEmOrdem(NoAB<E> n){
		if(n!=null){
			printEmOrdem(n.left);
			System.out.println(" "+n.element+" ");
			printEmOrdem(n.right);}
	}	

	public void printPosOrdem() {
		printPosOrdem(root);
	}
	public void printPosOrdem(NoAB<E> n) {
		if(n!=null){
			printPosOrdem(n.left);
			printPosOrdem(n.right);
			System.out.print(n.element+" ");}
	}

	@Override
	public void printPreOrdem() {
		printPreOrdem(root);
	}
	public void printPreOrdem(NoAB<E> n) {
		if(n!=null){
			System.out.println(n.element);
			printPreOrdem(n.left);
			printPreOrdem(n.right);}
		
	}
	
	public String toString(){
		return toString(root);
	}
	public String toString(NoAB<E> n){
		String str = "";
		if(n==null){
			return str;
		}
		str +=toString(n.left);
		str += n.element;
		str +=toString(n.right);
		return str;
	}

}

