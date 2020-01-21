import java.util.Scanner;

/**
 * Write a description of class linia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class linia
{
    // instance variables - replace the example below with your own
    private Producto producto;

    /**
     * Constructor for objects of class linia
     */
    public linia()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void comprar()
    {
        Scanner sc= new Scanner(System.in);
        String nombre;
        int cantidad;
        boolean palabra=false;
        while(!palabra){
            System.out.println("¿que deseas?");
            nombre=sc.nextLine();
            System.out.println("¿que cantidad?");
            cantidad=Integer.parseInt(sc.nextLine());
            if(nombre=="gracias")
            {
                palabra=true;
            }else
            {
             System.out.println("El precio es: " + getPrecioTotal(cantidad));
            }
        }
    }
    public double getPrecioTotal(int cantidad)
    {
        return cantidad*producto.getPrecio();
    }
}
