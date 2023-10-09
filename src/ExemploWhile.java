// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom; // biblioteca que gera números aleatórios.

public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 10.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
         }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextInt(2, 8);
   }
}