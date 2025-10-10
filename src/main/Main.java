package main;

import entity.Animal;
import entity.Animal2;
import entity.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  /*      entity.ZooManagement zooManagement = new entity.ZooManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("nbrCages: " );
       zooManagement.nbrCages=input.nextInt();
        System.out.println("zooName: " );
      zooManagement.  zooName=input.next();
        System.out.println(zooManagement.zooName+" comporte "+zooManagement.nbrCages+" Cages");

      System.out.println(zooManagement);*/
       Animal animal = new Animal();
       animal.setFamily("chien");
       animal.setName("lalou");
       animal.setAge(1);
       animal.setMammal(true);

       System.out.println(animal);
       Zoo zoo = new Zoo();
       zoo.setName("frigya");
       zoo.setCity("nfidha");
       System.out.println(zoo);

       Animal animal2 = new Animal("Chat","michou",1,true);
       System.out.println(animal2);
       Zoo zoo2 = new Zoo("My entity.Zoo","tunisia");
      System.out.println(zoo2);
      System.out.println(zoo2.addAnimal(animal));
              System.out.println(zoo2.addAnimal(animal));
              System.out.println(zoo2.addAnimal(animal)

              );
      System.out.println(zoo.addAnimal(animal2));
       System.out.println(zoo.addAnimal(animal2));
       System.out.println(zoo.addAnimal(animal2));
       zoo.afficherZoo();
       System.out.println(zoo.chercherAnimal(animal2));
       System.out.println(zoo.removeAnimal(animal));
       System.out.println(zoo.isZooFull());
       System.out.println(zoo.isZooFull1());
       System.out.println(Zoo.comparerZoo(zoo, zoo2));
        Animal2 animal3 = new Animal2();
        animal3.name="";

    }
}
