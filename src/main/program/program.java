
/*
 * Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
 * 
 * 
 * */

package main.program;


import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Retangle retangle = new Retangle();
	System.out.println("Enter rectangle width and height: ");
	retangle.width = sc.nextDouble();
	retangle.height = sc.nextDouble();
	
	System.out.println(retangle.toString());
	

	
	
	
	
	
	
	
	
	sc.close();
	

	}

}
