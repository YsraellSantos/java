package metodos_TelaLoguin;

import javax.swing.JOptionPane;

public class Loguin {
	public static void main(String[] args) {
       
   Verificacao verificacao = new Verificacao();
        
        verificacao.mostra();
        
     
        if (verificacao.verificacaoLoguin() && verificacao.verificacaoSenha()) {
            JOptionPane.showMessageDialog(null, "Login e senha corretos! Acesso permitido.");
        } else {
            JOptionPane.showMessageDialog(null, "Falha no login. Acesso negado.");
        }
    }
}