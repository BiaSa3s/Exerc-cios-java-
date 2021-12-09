package Dia09DeDezembro;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String args[])
	{
		int a,b,c,maior;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B:");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			maior = a;				
		}
		else if (b>a &&  b>c){
			 maior = b;}	
		else{ maior =c;
	}	
		System.out.println("O maior valor é: " +maior);
	}
}


