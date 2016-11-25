
public class paragemDeAutocarro {
	static int Capacidade = 15;
	
	static Queue Autocarro = new QueueClass<Integer>(Capacidade);
	static Queue Paragem = new QueueClass<Integer>(100);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adicionarPessoas(5, "P");
		adicionarPessoas(10, "P");
		//Paragem.displayQueue();
		System.out.println(Paragem.size());
		adicionarPessoas(Paragem.size(), "B");
		//Autocarro.displayQueue();
	}

	public static void adicionarPessoas(int NPessoas, String Opcao){
		int Entraram = 0;
		if(Opcao == "P"){
			for(int i=0;i < NPessoas;i++){
				Paragem.enqueue(1);
			}
			System.out.println("Chegaram "+ NPessoas +" pessoas a paragem");
		}
		if(Opcao == "B"){
			for(int i=0;i < NPessoas;i++){
				if(Entraram<Capacidade){
				Autocarro.enqueue(1);
				Entraram++;
				}
			}
			System.out.println("Entraram "+ Entraram+" pessoas no Autocarro");
		}
	}
	
	
}
