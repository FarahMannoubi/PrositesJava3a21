package entity;

public non-sealed class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammall, String habitat, float swimmingDepth) {
      /*this.family = family;
      this.name = name;
      this.age = age;
      this.isMammal=isMammall;
      this.habitat = habitat;*/
        super(family, name, age, isMammall, habitat);
      this.swimmingDepth = swimmingDepth;
    }
//    public Penguin() {
//        super();
//    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("Penguin swimming depth: " + swimmingDepth);
    }

    public String toString() {
        return super.toString()+"swimming depth: " + swimmingDepth;
    }
}
