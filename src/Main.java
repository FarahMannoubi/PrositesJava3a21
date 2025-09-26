import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  /*      ZooManagement zooManagement = new ZooManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("nbrCages: " );
       zooManagement.nbrCages=input.nextInt();
        System.out.println("zooName: " );
      zooManagement.  zooName=input.next();
        System.out.println(zooManagement.zooName+" comporte "+zooManagement.nbrCages+" Cages");

      System.out.println(zooManagement);*/
       Animal animal = new Animal();
       animal.family="Chien";
       animal.name="lalou";
       animal.age=1;
       animal.isMammal=true;
       System.out.println(animal);
       Zoo zoo = new Zoo();
       zoo.name = "frigya";
       zoo.city ="nfidha";
       zoo.nbrCages=600;
       System.out.println(zoo);

       Animal animal2 = new Animal("Chat","michou",1,true);
       System.out.println(animal2);
       Zoo zoo2 = new Zoo("My Zoo","tunisia",50);
      System.out.println(zoo2);


    }
}