package metodos;

public class Carro {

// atributos
	
	String nome;
	String marca;
	int anoCarro;
	float velocidade;
	String corCarro;
	
	void acelerar(int acelerando) {
		velocidade+=acelerando;
	}
	
	void freiar(int freiando ) {
		velocidade -=freiando;
	}
		
}
