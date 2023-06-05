import java.util.Scanner;

public class Main //Classe principal
{
	public static void main(String[] args) //Função principal
	{
		Scanner n = new Scanner(System.in);

		createOS(n);
		int resourcesQuantity = resourceParameters(n);

		System.out.println("Informe a quantidade de processos: ");
		int proccessQuantity = n.nextInt();

		Graph graph = new Graph(proccessQuantity);
		for (int i = 0; i < resourcesQuantity; i++)
		{
			System.out.println("Informe o remetente da aresta direcionada: ");
			int edgeSource = n.nextInt();
			System.out.println("Informe o destinatário da aresta direcionada: ");
			int edgeDest = n.nextInt();
			graph.addEdge(edgeSource, edgeDest);
		}
		/*
		// Function call
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't "
					+ "contain cycle");*/
	}
	private static int resourceParameters(Scanner n)
	{
		int resourcesQuantity = 0;
		while(resourcesQuantity>10 || resourcesQuantity<1) //Valor mínimo: 1; Valor máximo: 10;
		{
			System.out.println("Informe a quantidade de recursos (digite um valor entre 1 e 10): ");
			resourcesQuantity = n.nextInt();
		}
		for (int i=0; i<resourcesQuantity;i++) //Para cada recurso instanciado, é pedido um nome
		{
			System.out.println("Informe o nome do recurso: ");
			String resourceName = n.next();
			Resource resource = new Resource(resourceName, i+1, 1);
		}
		return resourcesQuantity;
	}

	private static void createOS(Scanner n)
	{
		System.out.println("Informe o intervalo de tempo de verificação: ");
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