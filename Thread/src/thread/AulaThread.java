package thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		for(int pos = 0; pos < 10; pos++) {
			
			// Execulta com um tempo de parada, ou com um tempo determinado
			Thread.sleep(1000);
			
			// Após o 
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
		}
		
		System.out.println("Chegou ao final do teste de thread");
	}
}
