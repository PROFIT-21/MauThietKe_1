package Singleton;

public class PrintSpooler {
	private static PrintSpooler instance;
	
	private PrintSpooler() {
		init();
	}
	
	private void init() {
		System.out.println("Initializing Print Spooler...");
	}
	
	public static PrintSpooler getInstance() {
		if (instance == null) {
			instance = new PrintSpooler();
		}
		return instance;
	}
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}
}
class MainApp {
	public static void main(String[] args) {
		PrintSpooler spooler1 = PrintSpooler.getInstance();
		PrintSpooler spooler2 = PrintSpooler.getInstance();
		
		spooler1.print("Tai_lieu_A.pdf");
		
		System.out.println("spooler1 va spooler2 la cung mot object: " + (spooler1 == spooler2));
	}
}


