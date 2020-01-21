import java.util.ArrayList;
/**
 * Write a description of class ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio2
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> numero;

    /**
     * Constructor for objects of class ejercicio2
     */
    public ejercicio2()
    {
       numero=new ArrayList(); 
    }

     public static void main(String[] args)
    {
       ejercicio2 e=new ejercicio2();
       e.sampleMethod();
    }
    public void sampleMethod()
    {
        int suma=0;
        int media;
        int maximo=0;
        int minimo=100;
        int contador=0;
        int tamaño= (int) (Math.random()*11+10);
        for (int i=0; i<tamaño; i++)
        {
            numero.add((int) (Math.random()*101));
        }
        for (int numerito:numero)
        {
            suma=suma+numerito;
            if(numerito<minimo)
            {
                minimo=numerito;
            }
            if(numerito>maximo)
            {
                maximo=numerito;
            }
        }
        media=suma/tamaño;
        System.out.println(suma);
        System.out.println(media);
        System.out.println(minimo);
        System.out.println(maximo);
    }
}
