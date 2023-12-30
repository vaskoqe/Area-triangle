import java.util.Scanner;
public class лт2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Добре дошли в програмата за намиране на лице на правоъгълен тръгълник. ");
		System.out.println("Въведи страна а: ");
		double a= input.nextDouble();
		System.out.println("Въведи страна b : ");
		double h = input.nextDouble();
		double area=(a*h)/2.0;
		System.out.println("Лицето на тръгълника е "+ area+"c㎡");
		
		
		

	}

}
