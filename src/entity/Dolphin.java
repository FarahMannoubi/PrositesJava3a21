package entity;

public final class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammall,String habitat,float swimmingSpeed) {
       super(family, name, age, isMammall, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public void swim(int swimmingSpeed){
        System.out.println("This dolphin is swimming");
    }
    public String talk(String habitat){
        return habitat+"lala";
    }
    public String toString() {
        return super.toString()+ "swimming speed: " + swimmingSpeed;
    }
}
