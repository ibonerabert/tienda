import java.util.ArrayList;
/**
 * Write a description of class ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio1
{
    // instance variables - replace the example below with your own
    private ArrayList<String> compañeros;

    /**
     * Constructor for objects of class ejercicio1
     */
    public ejercicio1()
    {
        compañeros= new ArrayList();
        compañeros.add("Ibone");
        compañeros.add("Diego");
        compañeros.add("Adrian");
        compañeros.add("Arturo");
        compañeros.add("Alejandro");
        compañeros.add("David");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
       ejercicio1 e=new ejercicio1();
       e.mostrar();
    }
    public void mostrar()
    {
        for(String compa:compañeros)
        {
            System.out.println(compa); 
        }
    }
}
