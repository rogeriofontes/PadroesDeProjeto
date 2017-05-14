package singleton;

public class SingletonTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++){
			System.out.println("Inicio processo Singleton" + System.currentTimeMillis());
			Singleton singleton = Singleton.getInstancia();
			singleton.foo();
			System.out.println("Fim processo Singleton" + System.currentTimeMillis());
		}
		
		for(int i = 0; i < 100; i++){
			System.out.println("Inicio processo Singleton Sincronizado" + System.currentTimeMillis());
			SingletonSincronizado singletonSincronizado = SingletonSincronizado.getInstancia();
			singletonSincronizado.foo();
			System.out.println("Fim processo Singleton Sincronizado" + System.currentTimeMillis());
		}
		
		SingletonEnum.INSTANCE.doStuff();
	}
}
