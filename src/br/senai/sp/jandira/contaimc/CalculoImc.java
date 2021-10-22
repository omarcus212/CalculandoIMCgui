package br.senai.sp.jandira.contaimc;
import br.senai.sp.jandira.frame.*;

public class CalculoImc {

	private double peso;
	private double altura;
	
	public void setpeso(String peso) {
		this.peso = Double.parseDouble(peso);
		
	}
		
	public double getpeso() {
		return this.peso;
	}
	
	public void setaltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}
    
	public double getaltura() {
		
		return altura;
	}
    
	public double calcularimc() {
		
		double imc = peso/Math.pow(altura, 2);
		return(imc);
	}
	
	public String obterimcString() {
		return String.valueOf(calcularimc());
	}
	
	public String mostradorimc() {
		if(calcularimc()<18.5) {
			return "ABAIXO DO PESO !";	
		}else if(calcularimc() >= 18.5 && calcularimc() < 25) {
			return "PESO IDEIAL !";
		}else if(calcularimc() >= 25 && calcularimc() < 30) {
			return "ACIMA DO PESO";
		}else if(calcularimc() >= 30 && calcularimc() < 35 ) {
			return "OBESIDADE GRAU 1";
		}else if(calcularimc() >= 35 && calcularimc() < 40) {
			return "PESO IDEIAL !";
		}else {
			return "OBESIDADE 3 !";
		}
	}

}
