import java.util.Scanner;

public class Bashemin {
	
	static Stack<Carro> parque1 = new ArrayStack<Carro>(10);
	static Stack<Carro> parque2 = new ArrayStack<Carro>(10);
	static int capacidade = 11;
	
	//Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro("B");
		Carro c2 = new Carro("C");
		Carro c3 = new Carro("D");
		
		
		//parque1.push(c3);
		estacionarCarro1(c1);
		estacionarCarro1(c2);
		estacionarCarro1(c3);
		parque1.display();
		tirarCarro1("D");
		System.out.println("----");
		parque1.display();
		
		//Scanner scanner = new Scanner(System.in);
		
		
	}
	public static void estacionarCarro1(Carro c){
		if(parque1.size() + parque2.size() < capacidade ){
			if(parque1.size()<11){
				parque1.push(c);
			}
		}else{
			System.out.print("Esta cheio");
		}
	}
	

	public void estacionarCarro2(Carro c){
	if(parque1.size() + parque2.size() < capacidade ){
		if(parque1.size()<11){
			parque1.push(c);
		}
	}else{
		System.out.print("Esta cheio");
	}
}

	public static void tirarCarro1(String matricula){
		Carro carroP = (Carro) parque1.top();
		String matriculaP =carroP.toString();
		while(matricula != matriculaP){
			parque2.push(parque1.pop());
			carroP.deslocar();
		}
		if(matricula == matriculaP){
			parque1.pop();
		}
		
		
	}
	}