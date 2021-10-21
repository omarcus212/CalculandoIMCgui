package br.senai.sp.jandira.contaimc;

import java.util.Scanner;

import br.senai.sp.jandira.contaimc.CalculoImc;

public class MostradorImc {

	

        Scanner leitor = new Scanner(System.in);
		CalculoImc calculos = new CalculoImc();
		

  public void mostrador() {
		
		String querdnv = "s";
		
		
		
		 while(querdnv.equals("s") || querdnv.equals("S")) {
		System.out.print("Digite sua altura : ");
		calculos.multiplicador();
		
		System.out.print("Digite seu pessinho : ");
		calculos.dividir();
		
		if(calculos.resultado<=18.5) {
			System.out.println("VOCÊ ESTA ABAIXO DO PESO, ***TEM QUE COMER MAIS McDonald´s!***");
		}else if(calculos.resultado>=18.6 && calculos.resultado<=24.9) {
			System.out.println("VOCÊ ESTA NO PESSINHO IDEIAL, ***CONGRATULATION***, MAS TAMBÉM SO TA BASICO NÉ?!");
		}else if(calculos.resultado>=25.0 && calculos.resultado<=29.9) {
			System.out.println("VOCÊ ESTA COM SOBREPESO, ***TA COM A BARRIGINHA SALIENTE EEEMMM*** ");
		}else if(calculos.resultado>=30 && calculos.resultado<=34.9) {
			System.out.println("VOCÊ ESTA COM OBESIDADE GRAU 1, ***POH VAMOS COMER MAIS LEGUMES, E PRATICAR UM BASQUETIZINHO*** ");
		}else if(calculos.resultado>=35 && calculos.resultado<=39.9) {
			System.out.println("VOCÊ ESTA COM OBESIDADE GRAU 2, ***MEUUUUUUU DEUUUUUUSSS DOIDOOOO,CHEGA DE McDonald´s PARA VOCÊ***");
		}else {
			System.out.println("VOCÊ ESTA COM OBESIDADE GRAU 3,PROCURE UM ESPECIALISTA IMEDIATAMENTE,***OBESIDADE NÃO É BRINCADEIRA***");
		}
		     
		System.out.println("quer calcular outro imc? (s),(n) : ");
		querdnv = leitor.next();
	
		 }
		  System.out.println("obrigado! até mais");
		leitor.close();
		
		
 }
}
