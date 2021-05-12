package chapter10;

public class Zoo {
    public static void main(String[] args){

        Dog rocky=new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha=new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha=new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
    }
    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("Feeding lovely dog");
        }
        else if(animal instanceof Cat){
            System.out.println("Feeding lovely cat");
        }
    }
}