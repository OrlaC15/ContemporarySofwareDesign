/**
 * Created by Orla on 03/04/2018.
 */
public class SRP {
    public static void main(String[] args) {
       Human human = new Human("Dale");
       Dog dog = new Dog("Sparky");
       human.walk();
       human.throwStick();
       dog.fetchStick();
       dog.bark();
    }
}


class  Human {

    String _name;

    public Human(String name) {
        _name = name;
    }
    public void throwStick(){
        System.out.println(_name + " is throwing a stick");
    }
    public void walk(){
        System.out.println(_name +" is walking");
    }
}

class Dog{

    String _name;

    public Dog(String name) {
        _name = name;
    }
    public void fetchStick(){
        System.out.println(_name +" is fetching a stick");
    }

    public void walk(){
        System.out.println(_name +" is walking");
    }

    public void bark(){
        System.out.println("Woof! ");
    }

}