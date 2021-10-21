package br.senai.sp.jandira.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.senai.sp.jandira.contaimc.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;
import br.senai.sp.jandira.contaimc.*;

public class FrameImc {
	
	
	public void criairFrame() {
		JFrame frameimc =  new JFrame();
		
		frameimc.setSize(300, 400);
		frameimc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameimc.setTitle("Calcule Seu IMC");
		frameimc.setLayout(null);

		JLabel lbltitulo = new JLabel();
		lbltitulo.setText("CALCULO IMC");
		lbltitulo.setBounds(60, 10, 160, 50);
		lbltitulo.setForeground(Color.BLUE);
		lbltitulo.setFont(new FontUIResource("CALCULO IMC", 1, 20));
		frameimc.getContentPane().add(lbltitulo);

		JLabel lblImcpeso = new JLabel();
		lblImcpeso.setText("Seu Peso : ");
		lblImcpeso.setBounds(20,60,100,30);
		frameimc.getContentPane().add(lblImcpeso);
		
		JLabel lblImcaltura = new JLabel();
		lblImcaltura.setText("Sua Altura : ");
		lblImcaltura.setBounds(20, 100, 160, 70);
		frameimc.getContentPane().add(lblImcaltura);
		
		JTextField fldimcpeso = new JTextField();
		fldimcpeso.setText("");
		fldimcpeso.setBounds(110, 60, 100, 30);
		frameimc.getContentPane().add(fldimcpeso);
		
		JTextField fldimcaltura = new JTextField();
		fldimcaltura.setText("");
		fldimcaltura.setBounds(110, 120, 100, 30);
		frameimc.getContentPane().add(fldimcaltura);
		
		JButton frameButton = new JButton();
		frameButton.setText("CALCULAR");
		frameButton.setBounds(58, 180, 160, 50);
		frameimc.getContentPane().add(frameButton);
		
		JLabel lblresultImc = new JLabel();
		lblresultImc.setBounds(20, 250, 120, 30);
		lblresultImc.setText("");
		frameimc.getContentPane().add(lblresultImc);
		
		JLabel lblestadopesoimc = new JLabel();
		lblestadopesoimc.setBounds(20, 280, 1000, 30);
		lblestadopesoimc.setText("");
		frameimc.getContentPane().add(lblestadopesoimc);
		
		
		
		frameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		         String peso =  fldimcpeso.getText();
		  
		         lblresultImc.setText(peso);
		         
		         String altura = fldimcaltura.getText();
		         double alutraresult = Double.parseDouble(altura);
		         
		         
		         double valorpeso = Integer.parseInt(peso);
		         double reultado =  valorpeso * alutraresult/2 ; 
		         lblresultImc.setText(String.valueOf("valor do IMC : " +reultado));
		         
		         
		         //mostradorimc
		         
		         MostradorImc mostradorimc =  new MostradorImc();
		         
		         String mostrador = lblestadopesoimc.getText();
		         mostradorimc.getClass();
		         lblestadopesoimc.setText("Seus estado IMC : " +mostradorimc);
		         
				
			}
		});
		
		
		frameimc.setVisible(true);
		
	}
	

}
