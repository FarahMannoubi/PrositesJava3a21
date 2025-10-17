package entity;

public final   class ZooManagement extends Admin {

    int nbrCages =20;
    String zooName="My zoo";
public String toString(){
    return "entity.Zoo Management : [ zoo Name: "
            + zooName + ", nbrCages: " + nbrCages + " ]";
}


    @Override
    public void calculateSalary() {

    }
}
