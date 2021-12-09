package Dia09DeDezembro;

import java.util.Scanner;
public class Exercício4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número qualquer: ");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{
			res = Math.sqrt(num);
		}
		else
		{
			res = Math.pow(num,2);
		}
		System.out.printf("\nResultado: %.2f",res);
	}

}



