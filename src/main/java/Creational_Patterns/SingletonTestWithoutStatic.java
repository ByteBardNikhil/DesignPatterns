package Creational_Patterns;

public class SingletonTestWithoutStatic {

}

class Singleton {
    
    public static Singleton instance;
    private Singleton() {
    }
    
    public Singleton getInstance()
    {
        if(instance==null)
        {
            synchronized (this) {
                if(instance==null)
                    instance=new Singleton();
                
            }
        }
        return instance;
    }
}
/*
if (instance == null): This is an initial check to see if an instance of the Singleton class already exists. If instance is not null, it means that an instance has already been created, and there's no need to proceed with further checks and synchronization.

synchronized (this) { ... }: If instance is null, it enters a synchronized block. Synchronization is used to ensure that only one thread at a time can create the instance. The synchronized (this) block locks on the current object (this) to prevent concurrent access.

if (instance == null) { ... }: Inside the synchronized block, there is another check to see if instance is still null. This is a second check to ensure that only one thread creates the instance while other threads are waiting.

instance = new Singleton();: If instance is still null inside the synchronized block, it creates a new instance of the Singleton class. This ensures that only the first thread that enters the synchronized block will create the instance, while subsequent threads will not.

return instance;: Finally, the method returns the instance, which is now guaranteed to be created. Subsequent calls to getInstance() will return the existing instance without creating a new one.*/
