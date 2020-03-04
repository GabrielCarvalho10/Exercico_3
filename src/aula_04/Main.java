package aula_04;

import com.sun.java_cup.internal.runtime.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		Scanner ler = new Scanner(System.in);
		int idade = ler.nextInt();
		
		if(idade > 20) {
			System.out.println("idade ,enor que 20");
		}
		else {
			if(idade > 12 && idade <12) {
				System.out.println("idade entre 12 e 17");
			}
			else {
				if(idade == 7 || idade < 7) {
					System.out.println("Idade igual a 7 ou menor que 5");
				}
				else {
					System.out.println("outras opcao");
				}
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
