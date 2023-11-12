import java.util.Scanner;

class Dog {

    int age;
    double weight;
    String name;
    String furColor;
    String breed;

    public Dog(int age, double weight, String name, String furColor, String breed) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.furColor = furColor;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public String rename(String n) {
        name = n; 
        return name;
    }

    public double eat(double c) {
        weight += c;
        return weight;
    }

}

public class Lab12B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        int age = input.nextInt();
        System.out.print("How much does the dog weigh: ");
        double weight = input.nextDouble();
        input.nextLine();
        System.out.print("What is the dog's name: ");
        String name = input.nextLine();
        System.out.print("What color is the dog: ");
        String color = input.nextLine();
        System.out.print("What breed is the dog: ");
        String breed = input.nextLine();

        Dog d1 = new Dog(age, weight, name, color, breed);

        System.out.print("\n"+d1.name+" is a "+d1.age+" year old "+d1.furColor+" "+d1.breed+" that weighs "+d1.weight+" lbs.");
        System.out.println("\n");
        d1.bark();
        
        System.out.print(d1.name+" is hungry, how much should he eat: ");
        double calories = input.nextDouble();
        d1.eat(calories);
        input.nextLine();
     
        System.out.print(d1.name+" isn't a very good name. What should they be renamed to: ");
        String newName = input.nextLine();
        d1.rename(newName);
        input.close();
        
        System.out.print("\n"+d1.name+" is a "+d1.age+" year old "+d1.furColor+" "+d1.breed+" that weighs "+d1.weight+" lbs.");
    }
}
