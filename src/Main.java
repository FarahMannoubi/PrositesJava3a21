import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        Scanner input = new Scanner(System.in);
        System.out.println("nbrCages: " );
       zooManagement.nbrCages=input.nextInt();
        System.out.println("zooName: " );
      zooManagement.  zooName=input.next();
        System.out.println(zooManagement.zooName+" comporte "+zooManagement.nbrCages+" Cages");

      System.out.println(zooManagement);
    }
}