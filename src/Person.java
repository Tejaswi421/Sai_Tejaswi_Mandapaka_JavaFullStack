//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Person {
    int age;
    float weight;
    float height;

    public Person() {
    }

    double calculateBMI() {
        return (double)(this.weight / (this.height * this.height));
    }

    void walk() {
        System.out.println("Person is walking");
    }
}
