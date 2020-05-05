import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		float  altura, pesoideal;
		String sexo;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite a sua altura (em metros): ");
		altura = leitor.nextFloat();
		

		System.out.println("Digite o seu sexo (masculino ou feminino): ");
		sexo = leitor.next();
			
		if (sexo.equals("masculino"))
		{pesoideal = (float) (((72.7)*altura)-58);
			System.out.println("Peso ideal: " + pesoideal);}
		else if (sexo.contentEquals("feminino"))
		{pesoideal = (float) (((62.1)*altura)-44.7);
		System.out.println("Peso ideal: " + pesoideal);}
		else;
		

	}

}