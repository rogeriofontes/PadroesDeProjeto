package singleton;

public enum SingletonEnum {
	INSTANCE;
	
    public void doStuff()
    {
        System.out.println("Singleton using Enum");
    }
}
