import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class OperationalSystem extends Thread {
	
	private int deltaTime;
	private ArrayList<Resource> resourceList;
	private ArrayList<Process> processList;
	
	
	
	public OperationalSystem(int deltaTime) {
		this.deltaTime = deltaTime;
		resourceList  = new ArrayList<>();
	}
		
	@Override 
	public void run() {
		setResource();
		timer();
		
	}
	
	public void detector() {
		
	}
	
	public void timer(){
		//contabilizo o deltaTime e chamo detector
		while(true) {
			try {
				sleep(deltaTime * 1000);
				detector();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public void addProcess() {
		Boolean userAnswer = true;
		while(userAnswer) {
			if(this.processList.size() == 10) break; //so podem haver 10 processos simultâneos
			Scanner n = new Scanner(System.in);
			System.out.println("Informe o id do processo: ");
			int processId = n.nextInt();
			System.out.println("Informe o intervalo de tempo de solicitação do recurso: ");
			int deltaTime = n.nextInt();
			System.out.println("Informe o tempo de utilização do recurso:");
			int deltaTimeU = n.nextInt();
			Process process = new Process(processId, deltaTime, deltaTimeU);
			this.processList.add(process);
			
			//verificar se o usuário ainda quer add novo processo
			System.out.println("Adicionar novo processo? (S/N)");
			String verify = n.next();
			if(verify != "S") userAnswer = false;
			if(userAnswer == false) break;
			
		}
		
	}
	
	public void setResource() {
		Boolean userAnswer = true;
		while(userAnswer) {
			Scanner n = new Scanner(System.in);
			System.out.println("Informe o nome do recurso: ");
			String resourceName = n.next();
			System.out.println("Informe o id do recurso: ");
			int resourceId = n.nextInt();
			System.out.println("Informe a quantidade do recurso: ");
			int qntResource = n.nextInt();
			Resource resource = new Resource(resourceName, resourceId, qntResource);
			this.resourceList.add(resource);
			System.out.println("Adicionar novo recurso? (S/N)");
			String verify = n.next();
			if(verify != "S") userAnswer = false;
			if(userAnswer == false) break;
		}
	}

}


/*
	 	Este thread tem a função verificar periodicamente (a cada intervalo Delta t) se existe algum deadlock no sistema. Se houver, deve informar ao usuário quais
	processos estão em deadlock e quais estão impedidos de rodar. Ao iniciar a execução da simulação,
	o programa deverá solicitar ao usuário o intervalo Delta t (em segundos), e em seguida instanciar o thread
	sistema operacional.
 */
 
