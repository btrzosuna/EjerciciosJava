import java.util.Scanner;
public class MovieDiscounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingresa tu edad");
		Scanner in= new Scanner(System.in);
		int edad = in.nextInt();
		float normal_ticket=7;
		if(edad<=5) {
			float price=(float) (normal_ticket - (normal_ticket*.60));
			System.out.println("El total a pagar es: $"+ price);
		}
		else if(edad>=60) {
			float price=(float) (normal_ticket - (normal_ticket*.65));
			System.out.println("El total a pagar es: $"+price);
		}
		else {
			System.out.println("Ingresa la cantidad de boletos que quieres comprar: ");
			Scanner x= new Scanner(System.in);
			int cant = x.nextInt();
				if(cant>=2){
					float price=(float) (normal_ticket - (normal_ticket*.30))*cant;
					System.out.println("El total a pagar es: $"+ price);
				}else {
					System.out.println("El total a pagar es: $"+ normal_ticket);
				}
				
		}
	}
	

}
