package singleton;

public class SingletonSincronizado {
	private static SingletonSincronizado instanciaUnica;

	private SingletonSincronizado() {
	}

	public static synchronized SingletonSincronizado getInstancia() {
		if (instanciaUnica == null) {
			System.out.println("Instancia sincronizada criada..");
			instanciaUnica = new SingletonSincronizado();
		}
		return instanciaUnica;
	}
	
	public void foo() {
		System.out.println("Chamou o metodo do singleton sincronizado");
	}
}
