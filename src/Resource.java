import java.util.concurrent.Semaphore;

public class Resource {
	
	private String resourceName;
	private int resourceId;
	public static Semaphore fullResource, emptyResource, mutex;
	
	public Resource(String resourceName, int resourceId, int qntResource) {
		this.resourceName = resourceName;
		this.resourceId = resourceId;
		this.emptyResource = new Semaphore(qntResource);
		this.fullResource = new Semaphore(0);
		this.mutex = new Semaphore(1);
	}
}


