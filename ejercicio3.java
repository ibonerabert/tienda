import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * Write a description of class ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio3
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> numero;

    /**
     * Constructor for objects of class ejercicio3
     */
    public ejercicio3()
    {
        // initialise instance variables
        numero=new ArrayList();
    }
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.println("Introduzca 10 enteros: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }

        System.out.println("Lista original: " + a);

        Collections.sort(a);

        System.out.println("Lista ordenada de menor a mayor: " + a);

    }
}
