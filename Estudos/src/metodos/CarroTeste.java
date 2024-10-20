package metodos;

public class CarroTeste {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.nome = "Ford Fusion";
        carro.corCarro = "Preto";
        carro.anoCarro = 2013;
        carro.velocidade = 100f;     
        
        System.out.println("Radar a frente, \nVelocidade Máxima: 80 km/h");
        carro.freiar(50);
        
        if (carro.velocidade >= 85) {
            System.err.println(carro.velocidade + " km/h - Multado por excesso de velocidade");
            System.err.println("Dirija sempre com o cinto de segurança");
            
            if (carro.velocidade >= 90 && carro.velocidade <= 96) {
                System.out.println("Você passou acima da velocidade permitida");
                System.out.println("Até 20% acima do limite: multa de R$ 130,16");
                
            } else if (carro.velocidade > 96 && carro.velocidade <= 120) {
                System.out.println("Você passou muito acima da velocidade permitida: " + carro.velocidade + " km/h");
                System.out.println("De 20% a 50% acima do limite: multa de R$ 195,23 e 5 pontos na CNH");
                
            }else if (carro.velocidade > 120 ) {
            	System.out.println("Você passou muito acima da velocidade permitida: " + carro.velocidade + " km/h");
				System.out.println("Mais de 50% acima do limite: multa de R$ 880,41 e 7 pontos na CNH");
			}
        } else {
            System.out.println("Sua velocidade atual é " + carro.velocidade + " km/h");
            System.out.println("Dirija sempre com o cinto de segurança");
        }
    }
}
