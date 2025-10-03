public class Zoo {
    Animal[] animals =new Animal[10]; // (tableau d’animaux, maximum 25)
    String name;
	String city;
	final int nbrCages =25;
    int nbAnimals=0;

    public Zoo() {}
    public Zoo(String name, String city) {
      animals = new Animal[nbrCages];
      this.name = name;
      this.city = city;

    }
    public void afficherZoo(){
    for (int i=0; i<animals.length; i++){
        System.out.println(animals[i]);
    }

    }
    public int chercherAnimal(Animal animal){
    for (int i=0; i<animals.length; i++){
        if (animals[i]==null)
            return -1;
        if (animals[i].name.equals(animal.name))
            return i;
    }
    return -1;
    }
    public boolean addAnimal(Animal animal) {
        if(chercherAnimal(animal)!=-1)
            return false;

        for(int i = 0; i < nbrCages; i++) {
           if(animals[i] == null) {
               animals[i] = animal;
               return true;
           }
        }
        return false;
    }
    public boolean removeAnimal(Animal animal) {
        int index = chercherAnimal(animal);
        if (index == -1)
            return false;
        if (index == animals.length)
            animals[animals.length] = null;
        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }
        return true;
    }

public boolean isZooFull(){
    for (int i=0; i<animals.length; i++){
        if (animals[i] == null)
            nbAnimals++;

    }
    if (nbAnimals == nbrCages)
        return true;
    return false;
}
    public boolean isZooFull1(){
        for (int i=0; i<animals.length; i++){
            if (animals[i] == null)
return false;
        }
        return true;
    }

public   static   Zoo comparerZoo(Zoo z1, Zoo z2){
    if (z1.nbAnimals <= z2.nbAnimals)
        return z2;
    return z1;
    }
public String toString(){
    return "Zoo: " + name + " " + city + " " + nbrCages;
}
}
