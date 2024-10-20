package metodos;

public class Personagens {

    String nome, sobrenome, email, senha;


    void mostraCadrastro() {
        System.out.format("Nome: %s %s \n", nome, sobrenome);
        System.out.format("Email: %s \n", email);
        System.out.format("Senha: %s \n", senha);
    }


    boolean verificaSenha() {
        if (senha.length() >= 6 && senha.matches(".*\\d.*")) {
            System.out.println(""); // Nao quero que exiba a mensagem
            return true; 
        } else {
            System.err.println();
            return false; 
        }
    }

 
    boolean verificaEmail() {
        if (email.contains("@gmail.com")) {
            System.out.println(""); // Nao quero que exiba a mensagem
            return true; 
        } else {
            System.err.println("Email inválido.");
            return false;
        }
    }
}
