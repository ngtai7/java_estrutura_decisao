import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		int numero1;
		
		System.out.println("Digite o um número: ");
		Scanner leitor = new Scanner(System.in);
		numero1 = leitor.nextInt();
		
		
		
		if (numero1%2 == 0)
		{System.out.println("O número é par!");
		}
		else 
		{System.out.println("O número é ímpar!");
		}
	
		

	}

}