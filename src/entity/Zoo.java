package entity;

public class Zoo {
    Animal[] animals =new Animal[10]; // (tableau d’animaux, maximum 25)
    private String name;
	 private String city;
	private final int nbrCages =25;
    private int nbAnimals=0;
    private Aquatic[]aquaticAnimals = new Aquatic[10];
    int i =0;


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
        if (animals[i].getName().equals(animal.getName()))
            return i;
    }
    return -1;
    }
    public boolean addAnimal(Animal animal) {
        if(isZooFull()){
            System.out.println("entity.Zoo Full");
            return false;


        }
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

    public void addAquaticAnimal(Aquatic aquatic){
        for (Aquatic animal : aquaticAnimals) {
if (i == aquaticAnimals.length-1)
    return;
            if (aquaticAnimals[i] == null){
                aquaticAnimals[i] = aquatic;
                i++;
                return;
            }
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxSwimmingDepth = 0;
        for (Aquatic animal : aquaticAnimals) {
            if (animal == null)
                return maxSwimmingDepth ;
            if (animal instanceof Penguin p){
                if(p.getSwimmingDepth()>maxSwimmingDepth)
                    maxSwimmingDepth = p.getSwimmingDepth();

            }
        }
        return maxSwimmingDepth;

    }
public void displayNumberOfAquaticsByType(){
        int nbrDolphins=0;
        int nbrPenguins=0;
        for (Aquatic animal : aquaticAnimals) {
            if (animal == null)
                return;
            if (animal.getClass() == Penguin.class)
            {
                nbrPenguins++;
            }
            if (animal.getClass() == Dolphin.class){
                nbrDolphins++;
            }

        }
        System.out.println("nbr Dolphins : "+nbrDolphins);
        System.out.println("nbr Penguins : "+nbrPenguins);
}
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public String getName(){return name;}


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    public void setNbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }



    public String toString(){
    return "entity.Zoo: " + name + " " + city + " " + nbrCages;
}
}
