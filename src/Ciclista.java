import java.util.Scanner;


public class Ciclista {

	public static void main(String[] args)throws CiclistaException{
		while(true){
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite a distância percorrida em Km e o tempo gasto em horas:");
			String valores = entrada.nextLine();
			
			double[] valores2 = interpretarValoresDeVelocidadeTempo(valores);
			
			double distancia = (double) valores2[0];
			double velocidade = (double) valores2[1];
			
			validando(distancia,velocidade);
			
			calcularVelocidadeMedia(distancia,velocidade);
			
			System.out.println(calcularVelocidadeMedia(distancia,velocidade));
		}
	}
	
	public static double[] interpretarValoresDeVelocidadeTempo(String valores) throws CiclistaException {
		
		String[] separaValores = valores.split(" ");
		
		double distancia = Double.parseDouble(separaValores[0]);
		double velocidade = Double.parseDouble(separaValores[1]);
		
		double[] valoresInterpretados = new double[2];	
		
		valoresInterpretados[0] = distancia;
		valoresInterpretados[1] = velocidade;
			
		return valoresInterpretados;
	}

	private static void validando(double distancia,double velocidade)throws CiclistaException {
		
		if(velocidade != 0 && distancia != 0){
			calcularVelocidadeMedia(distancia,velocidade);
		}else{
			throw new CiclistaException("A distância e o tempo devem ser maiores que zero!");
		}
		
	}

	public static double calcularVelocidadeMedia(double distancia,double velocidade) {
		
		double media = (Math.round(distancia / velocidade));
		
		return media;
	}
	
	

}
