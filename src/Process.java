
public class Process extends Thread{
	
	private int id;
	private int deltaT;
	private int deltaTu;
	
	public Process (int id, int deltaT, int deltaTu) {
		this.id = id;
		this.deltaT = deltaT;
		this.deltaTu = deltaTu;
	}
	
	@Override
	public void run() {};
	
	public void requireResource(){
		try {
			sleep(deltaT * 1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	public void utiliza(){
		try {
			sleep(deltaTu*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void freeResource(){}
	
}

/*
	 	Estes threads deverão solicitar, utilizar e liberar recursos existentes no
	sistema. Podem existir até 10 processos rodando “simultaneamente”.
	
		Criar thread processo: Durante a criação de cada processo devem ser definidos os seguintes
	parâmetros:
	• Id = identificador do processo.
	• DeltaTs = intervalo de tempo de solicitação (em segundos).
	A cada DealtaTs o processo solicita a utilização de um recurso escolhido aleatoriamente dentre
	os recursos existentes no sistema que ainda não foram concedidos ao respectivo processo. Se
	o recurso estiver disponível, o processo receberá o recurso, irá utilizá-lo e ao final deverá
	liberá-lo. Caso o recurso solicitado não esteja disponível, o processo deverá dormir e só
	deverá ser acordado quando o recurso que ele solicitou for liberado por outro processo.
	• DeltaTu = intervalo de tempo de utilização (em segundos).
	Após o processo ter tomado posse de um recurso, ele deverá utilizá-lo durante o intervalo de
	tempo DeltaTu e em seguida liberá-lo.
 
 */


