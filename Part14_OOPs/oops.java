package Part14_OOPs;

public class oops {
    public static void main(String[] args) {
        Players p1 = new Players();
        p1.academyName = "JSC";
        Players p2 = new Players();
        System.out.println(p2.academyName);
        Players p3 = new Players();
        p3.academyName = "ECC";
        System.out.println(p3.academyName);
        System.out.println(p1.academyName);

    }
}

class Players {
    String name;
    int registerNumber;
    static String academyName;

    int calPerformance(int r1, int r2, int r3) {
        return (r1 + r2 + r3) / 3;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

interface Herbivore {
    void eats();

    void noHunt();
}

interface Carnivore {
    void eats();

    void hunt();

}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Eats both plants and meat.");
    }

    public void hunt() {
        // something
    }

    public void noHunt() {
        // something
    }
}

interface ChessPlayer {
    void moves(); /*
                   * by default public and
                   * abstract method without implementation
                   */
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right and diagonal in all four directions");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right and diagonal by one step");
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Setting up value of color");
        this.color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        this.color = "yellow";
    }

    void walk() {
        System.out.println("walks on fours");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on twos");
    }
}

class Student {
    String name;
    int age;
    int marks[];

    // Shallow Copy Constructor
    /*
     * Student(Student s1) {
     * marks = new int[3];
     * this.marks = s1.marks;
     * this.name = s1.name;
     * this.age = s1.age;
     * }
     */

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.age = s1.age;
        this.name = s1.name;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() { // Constructors
        marks = new int[3];
        System.out.println("Calling the constructor");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int age) {
        marks = new int[3];
        this.age = age;
    }
}

class Pen {
    // properties
    private String color;
    private int tip;

    // functions
    String getColor() { // getter
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) { // setter
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
