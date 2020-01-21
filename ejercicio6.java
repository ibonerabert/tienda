import java.util.HashMap;
import java.util.Scanner;
/**
 * Write a description of class ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio6
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> map;

    /**
     * Constructor for objects of class ejercicio6
     */
    public ejercicio6()
    {
        map= new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap<String, String> m = new HashMap<String, String>();

        String usuario;
        String clave;
        boolean entra = false;
        int oportunidades = 3;

        m.put("admin", "224477");
        m.put("maria", "ztf99");
        m.put("pepe", "zxcvb");

        System.out.println("Por favor, introduzca nombre de usuario y "
            + "contraseña para acceder al area restringida.Dispone de "
            + "3 intentos.");

        do {
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Contraseña: ");
            clave = sc.nextLine();

            if (m.containsKey(usuario)) { // el usuario existe
                if (m.get(usuario).equals(clave)) {
                    System.out.println("Ha accedido al area restringida");
                    entra = true;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } else { // el usuario no existe
                System.out.println("El usuario introducido no existe");
            }

            oportunidades--;

            if (!entra && (oportunidades > 0)) {
                System.out.println("Le quedan " + (oportunidades) + " oportunidades");
            }

        } while ((!entra) && (oportunidades > 0));

        if (!entra){
            System.out.print("Lo siento, no tiene acceso al area restringida");
        }
    }

}
