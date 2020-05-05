import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		float preco, venda;
		
		System.out.println("Digite o preço do produto: ");
		Scanner leitor = new Scanner(System.in);
		preco = leitor.nextFloat();
			
		if (preco < 20.00)
		{   venda = (float) (1.45*preco);
			System.out.println("Preço de venda: " + venda);}
		else
		{   venda = (float) (1.30*preco);
			System.out.println("Preço de venda: " + venda);}
		
		

	}

}
