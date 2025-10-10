package entity;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

public Animal() {}
public Animal(String family, String name, int age, boolean isMammall) {
    this.family = family;
setName(name);
setAge(age);
isMammal = isMammall;
}



public String getName (){return name ;

}
public void setName (String name){
    if(name == null ){
        System.out.println("Name is null");
        return;
    }
    this.name = name;
}

    public String getFamily() {
        return family;
    }
public void setFamily(String family) {
    this.family = family;
}
public int getAge() {return age;}

    public void setAge(int age) {
    if(age<=0){
        System.out.println("Invalid Age");
        return;
    }
    this.age = age;
    }
    public boolean isMammal() {return isMammal;}
    public void setMammal(boolean mammal) {
    this.isMammal = mammal;
    }



public String toString() {
    return "entity.Animal [family=" + family + ", name=" + name + ", age=" + age + "]";
}
}
