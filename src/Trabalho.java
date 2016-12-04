
public class Trabalho<E> {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teste;
		
		teste = "(5-(23+3)*3)";
//		teste = "(6*(5-(3+2)*9/3))";
//		output devido: 6 5 34 2 + 9 * 3 / - *
		
		ABclass tree = new ABclass(infixToTree(teste));
		tree.printPosOrdem();
	}

	
	public static NoAB infixToTree(String s){
		
		ArrayStack<NoAB> numbers = new ArrayStack<NoAB>();
		
		ArrayStack<Character> operadores = new ArrayStack<Character>();
		
		int flag =0; //indica se a ultima letra lida foi um numero
		for(char ch : s.toCharArray()){
//			System.out.println();
//			numbers.display();
//			System.out.println();
//			operadores.display();
//			System.out.println();
			System.out.println("ciclo:");
			System.out.print("current  :");
			System.out.println(ch);
			if(ch == '('){											//caso seja paretese esquerdo
				flag = 0;											
				operadores.push(ch);
			}
			if(ch == '+' || ch== '-' || ch == '*' || ch == '/'){	//caso seja operador
				flag = 0;
				if(operadores.isEmpty()){						//caso a stack operadores esteja vazia
					operadores.push(ch);
				}
				else{
					while(prioridade(operadores.top()) > prioridade(ch)){	//caso a prioridade do perador no topo seja maior que o currente
						NoAB<Character> value1 = numbers.pop();
						NoAB<Character> value2 = numbers.pop();
						char op = operadores.pop();
						NoAB<Character> node  = new NoAB<Character>(op,value1,value2);
						numbers.push(node);
					}
					operadores.push(ch);
				}
			}
			System.out.print("operadores top  :");	
			System.out.println(operadores.top());	//debug operadores
			if(ch >= '0' && ch <= '9'){								//caso seja numero
				if(flag == 1){
					numbers.top().element += String.valueOf(ch);
				}
				if(flag ==0){
					NoAB<String> value = new NoAB<String>(String.valueOf(ch),null,null); ;
					numbers.push(value);
					flag = 1;
				}
			}
			System.out.print("numbers top  :");
			System.out.println(numbers.top());		//debug numbers
			if(ch == ')'){											//caso seja um parenteses direito
				flag = 0;
				while(operadores.top() !='('){
					NoAB<Character> value1 = numbers.pop();
					NoAB<Character> value2 = numbers.pop();
					char op = operadores.pop();
					NoAB<Character> node  = new NoAB<Character>(op,value1,value2);
					numbers.push(node);
				}
				operadores.pop();		//faz pop do '('
			}
		}
		System.out.println("fim de ciclo");
		/*
		numbers.display();
		System.out.println();
		operadores.display();
		**/
		
		while(!operadores.isEmpty()){
//			System.out.println(numbers.top());		//debug numbers
			NoAB<Character> value1 = numbers.pop();
//			System.out.println(numbers.top());		//debug numbers
			NoAB<Character> value2 = numbers.pop();
//			System.out.println(operadores.top());	//debug operadores
			char op = operadores.pop();
			NoAB<Character> node  = new NoAB<Character>(op,value1,value2);
			numbers.push(node);
			}
		
//		numbers.display();
//		operadores.display();
		return (numbers.pop());
	}
	
	
	
	
	
	
	
	
	public static int prioridade(char ch){
//		if(ch == '(')
//			return 3;
		if(ch == '/' || ch == '*')
			return 2;
		if(ch == '+' || ch == '-')
			return 1;
		return 0;
	}
}
