public class Inheritance{
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
    }
}

class Animal{
    int color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}