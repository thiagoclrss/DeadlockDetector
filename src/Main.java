import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("informe o intervalo de tempo de verificação: ");
		int deltaTimeDeadLock = n.nextInt();
		
		OperationalSystem os = new OperationalSystem(deltaTimeDeadLock);
		os.timer();
		System.out.println("");
		
	}
}

/*

	O projeto possui duas classes de threads: processos e sistema operacional. A classe
processos poderá ter várias instâncias, que devem simular os processos solicitando, utilizando e
liberando recursos do sistema. A classe sistema operacional terá apenas uma instância e ficará
responsável por detectar possíveis deadlocks.

	Antes de iniciar a simulação, o usuário deverá informar todos os recursos
existentes no sistema, e para cada recurso informado o usuário deverá configurar os seguintes
parâmetros:
• Nome do Recurso (Ex: Impressora)
• Identificador do Recurso (Ex: 1)
Obs.: A quantidade máxima de recursos é 10.

*/