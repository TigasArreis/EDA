
public class Carro {

	int deslocado;
	String matricula;
	
	public Carro(){
		matricula ="A";
		deslocado =0;
	}
	
	public Carro(String matricula){
		this.matricula = matricula;
		deslocado =0;
	}
	
	public void deslocar(){
		deslocado++;
	}
	public int getDeslocado(){
		return deslocado;
	}
	public String toString(){
		return matricula;
	}
}
