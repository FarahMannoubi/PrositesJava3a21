package entity;

public sealed class Aquatic extends Animal permits Dolphin,Penguin {
    protected String habitat;
    public Aquatic() {}
    public Aquatic(String family, String name, int age, boolean isMammall,String habitat) {
        super(family, name, age, isMammall);
        this.habitat = habitat;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
    public String talk(){
        return "from Aquatic "+habitat;
    }

    public String toString() {
        return super.toString()+"habitat: " +habitat;
    }
}
