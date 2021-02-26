package lacoderepetition;
import java.util.*;
public class exo6L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,soma=0,cont=0;
		float media;
		
		Scanner leia = new Scanner (System.in);
		
		
		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextInt(); //0
			if(num!=0)
			{
				if(num%3==0) 
				{
					soma = soma + num;
					cont++;
				}
			}
		}
		while(num!=0);
		
		if(cont==0)
		{
			System.out.println("\nNão existe divisão por 0!!!");
		}
		else
		{
		media = soma / cont;
		System.out.println("Média dos números múltiplos de 3: "+media);
		}

	}

}
