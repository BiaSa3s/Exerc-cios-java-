package Dia09DeDezembro;

import java.util.Scanner;

public class Exerc�cio2 {
	
	public static void main (String[] args)
	{
		/*
		 Menor		Meio		Maior
		 A			B			C
		 A			C			B
		 B			A			C
		 B			C			A
		 C			A			B
		 C			B			A
		 */
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B:");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("Ordem crescente: "+a+", "+b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("Ordem crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("Ordem crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("Ordem crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("Ordem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("Ordem crescente: "+c+", "+b+" e "+a);
		}
	}
}




