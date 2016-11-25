
public class teste {
	
	static ABP<Integer> arvore =new  ABPclass<Integer>();

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		arvore.insere(5);
		arvore.insere(3);
		arvore.insere(2);
		arvore.insere(8);
		arvore.insere(4);
		arvore.insere(10);
		arvore.insere(6);
		arvore.printEmOrdem();
		
//		System.out.println(arvore.findMax());
		
		arvore.remove(5);
		arvore.printEmOrdem();
		
	}

}
