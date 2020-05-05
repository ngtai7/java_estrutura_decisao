import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		Scanner leitor = new Scanner(System.in);
		nota1 = leitor.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leitor.nextFloat();
		
		media=(((2*nota1)+(3*nota2)+(5*nota3))/10);
		
		
		if (media>=7.0)
		{System.out.println("Aprovado!");
		}
		else 
		{System.out.println("Reprovado");
		}
	
		

	}

}