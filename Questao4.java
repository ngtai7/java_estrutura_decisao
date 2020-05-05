import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		float numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		Scanner leitor = new Scanner(System.in);
		numero1 = leitor.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leitor.nextFloat();
		
		
		if (numero1 > numero2)
		{System.out.println(numero1);
		System.out.println(numero2);}
		else if (numero1 < numero2)
		{System.out.println(numero2);
		System.out.println(numero1);}
		else;
		
		

	}

}