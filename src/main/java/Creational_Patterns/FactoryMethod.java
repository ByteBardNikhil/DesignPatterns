/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational_Patterns;

/**
 *
 * @author USER
 */
public class FactoryMethod {

    public static void main(String[] args) {

        System.out.println("Client using ConcreteCreatorA ");
        Creator creatorA=new ConcreteCreatorA();
        Product productA=creatorA.factoryMethod();
        productA.operation();
         
        System.out.println("Client using Concrete CreatorB : ");
        Creator creatorB=new ConcreteCreatorB();
        Product productB=creatorB.factoryMethod();
        productB.operation();
         
    }
}

interface Product {

    void operation();
}

class ConcreteProductA implements Product {

    public void operation() {
        System.out.println("Product A operation");
    }
}

class ConcreteProductB implements Product {

    public void operation() {
        System.out.println("Product B operation");
    }
}

interface Creator {

    Product factoryMethod();
}

class ConcreteCreatorA implements Creator {

    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
class ConcreteCreatorB implements Creator
{
    public Product factoryMethod()
    {
        return new ConcreteProductB();
    }
}
