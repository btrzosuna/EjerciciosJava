import java.util.Scanner;
public class ComissionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingresa la cantidad que vendiste: ");
		Scanner in = new Scanner(System.in);
	    double cant = in.nextDouble();
	   // System.out.println(cant);
	    double total;
	    if(cant > 10000) {
	    	total= cant* .30;
	    	System.out.println("El total a pagar de comisiones es: "+ total);
	    	
	    }
	    else if(cant >=5001 && cant <=9999) {
	    	total = cant * .20;
	    	System.out.println("El total a pagar de comusiones es: "+ total);
	    	
	    }
	    else if (cant>=1001 && cant<=4999 )	{
	    	total = cant * .10;
	    	System.out.println("El total a pagar de comisiones es: " + total);
	    	
	    }
	    else {
	    	System.out.println("A usted no le van a pagar comisiones");
	    }
	}

}
