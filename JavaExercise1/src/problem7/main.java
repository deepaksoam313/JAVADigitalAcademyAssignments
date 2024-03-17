package problem7;

import java.sql.SQLOutput;
import java.util.*;

public class main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Adding elements in the list
        System.out.println("enter the numbers you want to add in the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0; i<size; i++){
            list.add(sc.nextInt());
        }

        //print all the elements of the list
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+"\t");

        //Remove an element from a specific position in the ArrayList
        System.out.print("\nEnter the position of the number you want to remove from the list: ");
        int pos = sc.nextInt();
        list.remove(pos);

        //Check if a particular element exists in the ArrayList
        System.out.println("\nEnter the number to check in the list: ");
        int number = sc.nextInt();
        System.out.println("Number present in the list -> "+ list.contains(number));

        System.out.println("print sorted list");
        //Sort the ArrayList in ascending order
        Collections.sort(list);

        //Print the sorted ArrayList
        //print all the elements of the list
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+"\t");

 }

}
