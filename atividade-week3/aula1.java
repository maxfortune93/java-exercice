package Turma17;
import java.util.*;
public class aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, total, meses, dias;
		Scanner cool= new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade=cool.nextInt();
		
		System.out.println("Digite seu mes: ");
		meses=cool.nextInt();
		
		System.out.println("Digite seu dia: ");
		dias=cool.nextInt();
		
		total= idade*365+meses*30+dias;
		
		System.out.println("voce tem : "+total+" dias de vida");
		
		
				
		
				
		
					
	}

}
