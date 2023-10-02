package Creational_Patterns;

public class Singleton {

    public static void main(String[] args) {
        SingletonImplement s1 = SingletonImplement.getInstance();
        SingletonImplement s2 = SingletonImplement.getInstance();

        if (s1 == s2) {
            System.out.println("Same Object Created");
        }
        else
            System.out.println("Object are different");
    }

}

class SingletonImplement {

    private static SingletonImplement instance;

    private SingletonImplement() {
    }

    public static SingletonImplement getInstance() {
        if (instance == null) {
            instance= new SingletonImplement();
        }
        return instance;
    }
}

/*
The Singleton design pattern is a creational pattern that ensures a class has only one instance and provides a global point of access to that instance. Here are some important points to consider when working with the Singleton pattern:

Private Constructor: The Singleton class has a private constructor to prevent direct instantiation of the class from outside. This ensures that no more than one instance can be created.

Static Instance: It typically maintains a private static instance variable that holds the single instance of the class.

Lazy Initialization: The Singleton instance is often created lazily, meaning it's created the first time it's requested, not during class loading. This helps save resources if the instance is never used.

Global Access Point: A public static method (often named getInstance()) is provided to access the Singleton instance. This method is responsible for creating the instance if it doesn't exist or returning the existing instance.


 */
