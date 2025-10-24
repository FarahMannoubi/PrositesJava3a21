package entity;

public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin {
    protected String habitat;
    public Aquatic() {}

    @Override
    public void affiche() {
        System.out.println("Aquatic : " + habitat);
    }

    public Aquatic(String family, String name, int age, boolean isMammall,String habitat) {
        super(family, name, age, isMammall);
        this.habitat = habitat;
    }
    public abstract void swim();
    public String talk(){
        return "from Aquatic "+habitat;
    }
public boolean equals(Object obj) {
        if (obj == this) return true;
        if(obj == null) return false;
       if(obj instanceof Aquatic aquatic){
           return this.habitat.equals(aquatic.habitat)&&this.name.equals(aquatic.name)&&this.age == aquatic.getAge();
       }
       return false;
}
    public String toString() {
        return super.toString()+"habitat: " +habitat;
    }
}
