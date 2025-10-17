package entity;

public sealed abstract class User permits RH,Developer,Admin {

    String name;
    String password;
    int age;
    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
    public User (

    ){}
public void afficher(){
        System.out.println(this.name);
}
    public abstract void calculateSalary();
}
