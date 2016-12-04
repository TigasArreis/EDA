

public class Calculadora<E> {
	
//	ABPclass tree = new ABPclass();
	
//	ArrayStack stack =  new ArrayStack();
	
	static String teste;

	public static void main(String[] args) {
		
		teste = "2+3*3";
//		teste = "(6*(5-(34+2)*9/3))";
//		output devido: 6 5 34 2 + 9 * 3 / - *
		teste = infixToPostfix(teste);
		System.out.println(teste);
		infixToTree(teste);
	}
	
	public static  String infixToPostfix(String s){
		ArrayStack<Character> operadores = new ArrayStack<Character>();
		String output = "";
		
		for(char ch : s.toCharArray()){
			//System.out.println(output); //debug
			if( ch >= '0'  && ch <= '9' ){  //se for um numero
				output += ch;
			}
			else{
				output += " "; //posicao original
				if( ch == ')'){		//no caso de ler um parenteses fechado
					while(operadores.top()!='('){
						output += " ";
						output += operadores.pop();
					}
					operadores.pop();
				
				}else{				// no caso de ser outro operador
//					System.out.println(ch); //debug
					if(operadores.isEmpty()==true){	//no caso de estar vazio
						operadores.push(ch);}
					else{
						if(prioridade(ch) > prioridade(operadores.top())){	//no caso do operador ter maior prioridade
							operadores.push(ch);
						}		
						else{
							while(prioridade(operadores.top())< prioridade('(') && prioridade(operadores.top()) >= prioridade(ch)){
								output += " "; 
								output+=operadores.pop();
								//System.out.println(ch); //debug
							}
							operadores.push(ch);
						}
					}
				}
			}
		}
		while(!operadores.isEmpty()){ 
			if(operadores.top()!='('){	//para nao adicionar os parenteses
				output += " "; //posicao original
				output += operadores.pop();
			}
			else
				operadores.pop();
		}
		return output;
	}
				
		public static int prioridade(char ch){
			if(ch == '(')
				return 3;
			if(ch == '/' || ch == '*')
				return 2;
			if(ch == '+' || ch == '-')
				return 1;
			return 0;
		}
				
		public static void infixToTree(String s){
			ArrayStack auxiliar = new ArrayStack();
			ABclass treeTemp = new ABclass();
			ABclass tree = new ABclass();
			
			String number ="";
//			output devido: 6 5 34 2 + 9 * 3 / - *
			for(char ch : s.toCharArray()){
				System.out.println("----paralavra:	");
				System.out.println(ch);
				if(ch >= '0' && ch <= '9'){
					number += ch;
				}
				if(ch == ' '){
					if(number !=""){
						System.out.print("adiciona numero:");
						auxiliar.push(number);
						number ="";
						System.out.println(auxiliar.top());}
				}
				if((ch == '+' )||( ch == '-' )||(ch == '*')||(ch == '/')){
//					ABclass treeTemp = new ABclass();
					
					treeTemp.insere(ch);
					System.out.print("-top1-	");
					System.out.println(auxiliar.top());
					treeTemp.insere(auxiliar.pop());
					System.out.print("-top2-	");
					System.out.println(auxiliar.top());
					treeTemp.insere(auxiliar.pop());
					//treeTemp.printEmOrdem();
					auxiliar.push(treeTemp);
					System.out.println("---fim----	");
				}
				System.out.println("stack:");
				auxiliar.display();
				System.out.println("");
				System.out.println("arvore:");
				treeTemp.toString();
				System.out.println("");
			}
		}
				
				
				
				
			
		
		
		
	}

