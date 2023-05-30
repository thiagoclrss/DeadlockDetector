import java.util.ArrayList;

public class OperationalSystem extends Thread {
	
	private int deltaTime;
	private ArrayList<Resource> resources;
	
	public OperationalSystem(int deltaTime) {
		this.deltaTime = deltaTime;
		resources  = new ArrayList<>();
	}
		
	@Override 
	public void run() {
		timer();
	}
	
	public void detector() {
		
	}
	
	public void timer(){
		//contabilizo o deltaTime e chamo detector
		detector();
	}
}


/*
	 	Este thread tem a função verificar periodicamente (a cada intervalo Delta t) se existe algum deadlock no sistema. Se houver, deve informar ao usuário quais
	processos estão em deadlock e quais estão impedidos de rodar. Ao iniciar a execução da simulação,
	o programa deverá solicitar ao usuário o intervalo Delta t (em segundos), e em seguida instanciar o thread
	sistema operacional.
 */
 
