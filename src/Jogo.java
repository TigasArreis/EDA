
public class Jogo {

		Stack<Integer> jogo = new ArrayStack<Integer>(11);
		
		
		public void adiciona(int a,Stack J){
			J = jogo;
			Stack<Integer> auxiliar = new ArrayStack<Integer>(3);
			if(J.size()>= 11){	//verificar se ta cheio
				if(a<=5 && a>=1){	//verificar se é entre 1 e 5
					if(jogo.size()<2){
						jogo.push(a);
						
						}else{
							if(jogo.top()== a){ // compara o primeiro numero
								auxiliar.push(jogo.pop());		//se forem iguais mete na stack auxiliar e faz pop
								if(jogo.top()== a){	//compara o segundo numero
									jogo.pop();				// se forem iguais faz pop
								
								}else{
									jogo.push(auxiliar.pop()); // o segundo elemento é diferente logo faz push dos dois numeros
									jogo.push(a);
								}
							}else{jogo.push(a);} //se o primeiro for diferente
						}
				}
				
			}
		}
		public void remover(int a){
			
			Stack<Integer> auxiliar = new ArrayStack<Integer>(10);
			
			if(jogo.isEmpty() == false){
				for(int j = jogo.size();j>= a;j--){
					auxiliar.push(jogo.pop());
				}
				jogo.pop();
				for(int i = auxiliar.size();i >= 0;i--){
					jogo.push(auxiliar.pop());
				}
			}
		}
		public void trocar(int a){
			Stack<Integer> auxiliar = new ArrayStack<Integer>(10);
			
			if(jogo.isEmpty()== false){
				for(int j = jogo.size();j> a;j--){
					auxiliar.push(jogo.pop());
				}
				int holder = jogo.pop();
				for(int i = jogo.)
				
				
			}
			
		}
		
		
}
