import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		int numero1, numero2, soma;
		
		System.out.println("Digite o primeiro numero: ");
		Scanner leitor = new Scanner(System.in);
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leitor.nextInt();
		
		soma=numero1+numero2;
		
		
		
		if (soma > 10)
		{System.out.println(soma);}
		
		

	}

}