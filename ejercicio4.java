import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * Write a description of class ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio4
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ejercicio4
     */
    public ejercicio4()
    {
        // initialise instance variables
        x = 0;
    }

    
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList();

    System.out.println("Introduzca 10 palabras:");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      a.add(sc.nextLine());
    }

    System.out.println("Lista original: " + a);

    Collections.sort(a);

    System.out.println("Lista ordenada alfabeticamente: " + a);

  
  }

}
