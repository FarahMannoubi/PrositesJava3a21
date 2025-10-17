package entity;

public non-sealed abstract class Developer extends User {
    int id;
    public Developer( String name, String password, int age,int id) {
       super(name, password, age);
       this.id = id;
    }

    public Developer( String name, String password, int age) {
this.name=name;
this.password=password;
this.age=age;
    }

}
