package arrays;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,0,5,-2,-5,7};
		int soma=0,p;
		// l++ = l+1 ;;
		
		for (int l=0;l<6;l++) {
			
			if(l==0||l==1||l==5 ) {
				p=a[l];
				soma=soma+p;
			}
			if(l==4) {
			a[l]=100;
			}
			System.out.printf("%nO valor de vetor a é %d ",a[l]);
		
	}
	}
}
