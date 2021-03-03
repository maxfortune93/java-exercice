package arrays;
import java.util.*;
public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];
		int par,impar=0, soma=0,l;
		
		Scanner ler= new Scanner(System.in);
		
		for(l=0;l<6;l++) {
			
			System.out.printf("%ndigite um numero :");
			num[l] = ler.nextInt();
			
			if(num[l]%2==0) {
				
				System.out.printf("%n Os numeros pares sao : %d",num[l]);
				
				soma=soma+num[l];
				
			}
			
			else {
				
				System.out.printf("%n Os numeros impares sao : %d ",num[l]);
				impar++;
				
				
			}
			
		}
		
		System.out.printf("%n A soma dos pares : %d ",soma);
		
		System.out.printf("%n Os numeros impares digitados : %d ",impar);
		
		
		
		
	}

}
