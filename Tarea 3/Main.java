package Tarea3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a= 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor ingrese un número");
		a = s.nextInt();
		if(a%2 == 0){
				System.out.println("El numero es par");
		}else{
				System.out.println("El número es impar");
		}
	}

	}
	


