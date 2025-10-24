package main;

import entity.*;

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
    //   Animal animal = new Animal();
     /*  animal.setFamily("chien");
       animal.setName("lalou");
       animal.setAge(1);
       animal.setMammal(true);*/

      // System.out.println(animal);
       Zoo zoo = new Zoo();
       zoo.setName("frigya");
       zoo.setCity("nfidha");
       System.out.println(zoo);

    //   Animal animal2 = new Animal("Chat","michou",1,true);
     //  System.out.println(animal2);
       Zoo zoo2 = new Zoo("My entity.Zoo","tunisia");
      System.out.println(zoo2);
 /*     System.out.println(zoo2.addAnimal(animal));
              System.out.println(zoo2.addAnimal(animal));
              System.out.println(zoo2.addAnimal(animal)

              );
      System.out.println(zoo.addAnimal(animal2));
       System.out.println(zoo.addAnimal(animal2));
       System.out.println(zoo.addAnimal(animal2));*/
       zoo.afficherZoo();
   //    System.out.println(zoo.chercherAnimal(animal2));
     //  System.out.println(zoo.removeAnimal(animal));
       System.out.println(zoo.isZooFull());
       System.out.println(zoo.isZooFull1());
       System.out.println(Zoo.comparerZoo(zoo, zoo2));
        Animal2 animal3 = new Animal2();
        animal3.name="";
      //  Aquatic aquatic = new Dolphin();
       // Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin("Dolphin","dofdof",2,true,"habitat",3);
        Penguin penguin = new Penguin("Penguin","batbout",1,false,"habitat",3);
 Aquatic aquatic =new Penguin();
   System.out.println(aquatic);
 //  System.out.println(terrestrial);
   System.out.println(dolphin);
   System.out.println(penguin);
 //  aquatic.swim();
  dolphin.swim();
  dolphin.swim(3);
       // System.out.println(aquatic.talk());
        System.out.println(dolphin.talk("testtt"));
  penguin.swim();
 // zoo.addAquaticAnimal(aquatic);
  zoo.addAquaticAnimal(dolphin);
  zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(penguin);
        for (Aquatic a : zoo.getAquaticAnimals()) {
            if(a ==null)
                return;
            a.swim();
        }
zoo.getAquaticAnimals();





    }
}
