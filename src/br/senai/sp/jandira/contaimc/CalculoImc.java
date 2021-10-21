package br.senai.sp.jandira.contaimc;

import java.util.Scanner;

import br.senai.sp.jandira.contaimc.MostradorImc;

public class CalculoImc {

	
    public double pesoo,altura,resultado,resultado2;
    Scanner leitor = new Scanner(System.in);

    
    public void multiplicador() {
    altura = leitor.nextDouble();
    resultado2=altura*2;
    System.out.println();
   
  }

    public void dividir() {
    pesoo = leitor.nextDouble();
    resultado=pesoo/resultado2;
    System.out.println(resultado);

   
   } 
    
    
    
    
}
