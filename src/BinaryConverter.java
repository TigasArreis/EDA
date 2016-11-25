import java.util.Scanner;

public class BinaryConverter {
	
	static Stack binario = new ArrayStack<Integer>(100);

	public static void main(String[] args) {
		
		
		Scanner numero = new Scanner(System.in);
		int inteiro = numero.nextInt();
		recebeInput(inteiro);
		binario.display();
	}
	public static void recebeInput(int inteiro){
		if(inteiro >0){
		binario.push(inteiro % 2);
		inteiro = inteiro / 2;
		recebeInput(inteiro);
		}
		}
		
	}
	

