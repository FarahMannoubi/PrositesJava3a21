public class Animal {
    String family;
String name;
int age;
boolean isMammal;

public Animal() {}
public Animal(String family, String name, int age, boolean isMammall) {
    this.family = family;
    this.name = name;
    this.age = age;
    isMammal = isMammall;
}

public String toString() {
    return "Animal [family=" + family + ", name=" + name + ", age=" + age + "]";
}
}
