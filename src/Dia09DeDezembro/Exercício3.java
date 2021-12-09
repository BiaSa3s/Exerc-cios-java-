package Dia09DeDezembro;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String args[])
	{
		int idade = 20;
		String nome = "Beatriz";
		
		System.out.println("\nSeu nome: "+ nome);
		
		System.out.println("\nVocê tem: "+ idade + " anos ");
		
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nDe acordo com a sua idade você é classificada como infantil! ");
			
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nDe acordo com a sua idade você é classificada como Juvenil! ");
			
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nDe acordo com a sua idade você é classificada como adulta! ");
		}
		
		
		
	}
}
