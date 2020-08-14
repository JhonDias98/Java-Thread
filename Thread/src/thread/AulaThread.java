package thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo
		new Thread() {
			
			public void run() { //Executa o que nós queremos
				// Código da rotina
				// Código das rotinas que eu quero executar em paralelo
				for(int pos = 0; pos < 10; pos++) {
					
					// Execulta com um tempo de parada, ou com um tempo determinado
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				}
				// Fim do código em paralelo
				
			}
			
		}.start();// Inicia a thread que fica processando paralelamente por trás
		
		
		// Código do sistema do usuário que vai continuar no fluxo de trabalho
		System.out.println("Chegou ao final do teste de thread");
		//Fluxo do sistema, como por exemplo uma emissão de nota fiscal
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
}
