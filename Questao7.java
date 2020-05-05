import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		int idade1, idade2;
		String nome1, nome2;
		
		System.out.println("Digite o nome da primeira pessoa: ");
		Scanner leitor = new Scanner(System.in);
		nome1 = leitor.next();
		System.out.println("Digite a idade da primeira pessoa: ");		
		idade1 = leitor.nextInt();		
		
		System.out.println("Digite o nome da segunda pessoa: ");
		nome2 = leitor.next();
		System.out.println("Digite a idade da segunda pessoa: ");		
		idade2 = leitor.nextInt();		
		
		if (idade1>idade2)
		{System.out.println("Nome: " + nome1);
		System.out.println("Idade: " + idade1);
		}
		else if (idade2>idade1) 
		{System.out.println("Nome: " + nome2);
		System.out.println("Idade: " + idade2);
		}
	
		

	}

}