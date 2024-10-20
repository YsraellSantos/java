package metodos;

public class CadrastroMain {
	public static void main(String[] args) {
		
		Personagens perso = new Personagens();
		perso.nome = "Israel";
		perso.sobrenome = "Custodio";
		perso.email = "ysraellsanoss@gmail.com";
		perso.senha ="1234589";

		if (!perso.verificaSenha()) {
		      System.out.println("Cadastro não realizado: Senha inválida.");
			return;
		}
		
		if (!perso.verificaEmail()) {
			  System.out.println("Cadastro não realizado: Email inválido.");
			return;
		}
		
		perso.mostraCadrastro();
	}
}
                                                      