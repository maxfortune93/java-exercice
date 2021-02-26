package Turma17;
import java.util.*;
import java.math.*;
public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, x2, y1, y2, d; //p
		Scanner dist= new Scanner(System.in);
		System.out.println("Digite o valor x1");
		x1= dist.nextDouble();
		System.out.println("Digite o valor y1");
		y1= dist.nextDouble();
		System.out.println("Digite o valor x2");
		x2= dist.nextDouble();
		System.out.println("Digite o valor y2");
		y2= dist.nextDouble();
		
		//p=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		
		d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.println("A distancia entre eles é "+ d);
		
		dist.close();
		
	}

}
