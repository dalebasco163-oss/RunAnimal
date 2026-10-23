import java.util.Scanner;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}

class Bird extends Animal {
void eat() {
System.out.println("Birds love to eat seeds and sleep for 10-12 hours a day.");
}

void sleep() {
 
}

void makeSound() {
System.out.println("Tweet tweet");
}
}

class Cat extends Animal {
void eat() {
System.out.println("Cats love to eat fish.");
}

void sleep() {
System.out.println("Cats sleep for many hours a day.");
}

void makeSound() {
System.out.println("Meow meow");
}
}

class Dog extends Animal {
void eat() {
System.out.println("Dogs love to eat meat.");
}

void sleep() {
System.out.println("Dogs sleep for several hours a day.");
}

void makeSound() {
System.out.println("Woof woof");
}
}

public class RunAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
while(true){
System.out.print("\nChoose an animal. Press B for Bird, C for Cat, or D for Dog: ");

String choice = sc.nextLine();

Animal animal;
if (choice.equalsIgnoreCase("B")) {
animal = new Bird();

} else if (choice.equalsIgnoreCase("C")) {
animal = new Cat();

} else if (choice.equalsIgnoreCase("D")) {
animal = new Dog();
} else {
    
 System.out.println("Invalid choice.");
sc.close();
return;
}

animal.eat();

if (choice.equalsIgnoreCase("B")) {
animal.makeSound();

} else {
animal.sleep();
animal.makeSound();
}

    }
}
}