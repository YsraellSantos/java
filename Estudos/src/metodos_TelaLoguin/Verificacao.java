package metodos_TelaLoguin;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Verificacao {
	
	// metodos
	
	String login,senha;

	
	void mostra() {
		
		Scanner teclado = new Scanner(System.in); 
		JOptionPane.showInputDialog(null, "Digite seu Email");
		JOptionPane.showInputDialog(null, "Digite seu Senha");	
		
		teclado.close();
	}
	// construto{
	
	boolean  verificacaoLoguin() {
		
		if (login != null && login.contains("@gmail.com")) {
			JOptionPane.showMessageDialog(null,"loguin Valida");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Email Invalido");
			return false;
		}
	
	}
	
	boolean verificacaoSenha() {
		if(senha != null && senha.length() >= 6 && senha.matches(".*\\d.*")){
			JOptionPane.showMessageDialog(null, "Senha Valida");
			return true;
			
		} else {
			JOptionPane.showMessageDialog(null, "Loguin inválido. A senha deve conter pelo menos um número e ter pelo menos 6 caracteres");
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
