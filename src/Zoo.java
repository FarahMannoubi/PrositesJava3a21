public class Zoo {
    Animal[] animals; // (tableau d’animaux, maximum 25)
    String name;
	String city;
	int nbrCages;
public Zoo() {}
    public Zoo(String name, String city, int nbrCages) {
      animals = new Animal[nbrCages];
      this.name = name;
      this.city = city;
      this.nbrCages = nbrCages;

    }
public String toString(){
    return "Zoo: " + name + " " + city + " " + nbrCages;
}
}
