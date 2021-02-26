package Turma17;
import java.util.*;
public class exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, media;
		Scanner notas= new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		n1= notas.nextDouble();
		System.out.println("digite a segunda nota");
		n2= notas.nextDouble();
		System.out.println("Digite a terceira nota");
		n3= notas.nextDouble();
		media= n1*0.2+ n2*0.3+ n3*0.5;
		System.out.println("A média é "+media);
		notas.close();
	}

}
