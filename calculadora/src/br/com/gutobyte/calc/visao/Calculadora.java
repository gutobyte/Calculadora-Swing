package br.com.gutobyte.calc.visao;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora(){
		
		organizarLayout();
			
		//largura e altura
		setSize(232, 322);
		/*sumir com as barras com os botões expandir, fechar, minimizar, fazer isso apenas se tiver interesse em 
		*em criar uma barra personalizada, neste caso mude para true 
		*/
		setUndecorated(false);
		//finalizar aplicação ao fechar janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//aplicação iniciar no centro da tela
		setLocationRelativeTo(null);;
		
		
		
		//ficar visivel
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER); 
		
	}

	public static void main(String args[]) {
		
		new Calculadora();
		
		
		
	}

}
