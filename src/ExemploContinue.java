// class ExemploBreakContinue.java
public class ExemploContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=10; numero ++){
		if(numero % 2 == 0)
			continue;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ? Só imprime númerto ímpar. Quando a variável é par, ela volta para o laço e não imprime.

    }
}