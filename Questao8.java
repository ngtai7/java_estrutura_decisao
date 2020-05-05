import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		String senha;
		
		System.out.println("Digite a senha: ");
		Scanner leitor = new Scanner(System.in);
		senha = leitor.next();
			
		if (senha.equals("AEDB"))
		{System.out.println("Acesso permitido");}
		else
		{System.out.println("Você não tem acesso");}
		
		

	}

}