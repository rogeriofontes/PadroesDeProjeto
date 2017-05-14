package singleton;

public class Singleton {
	private static Singleton instanciaUnica;

	private Singleton() {
	}

	public static Singleton getInstancia() {
		if (instanciaUnica == null) {
			System.out.println("Instancia criada..");
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}
	
	public void foo() {
		System.out.println("Chamou o metodo do singleton");
	}
}
