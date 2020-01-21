import java.util.HashMap;
import java.util.Scanner;
/**
 * Write a description of class pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pedido
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, linea> map;
    String direccion;
    String nombreCliente;
    /**
     * Constructor for objects of class pedido
     */
    public pedido()
    {
        map=new HashMap<>();
       
    }

    public void añadir(int codigo, linea linea )
    {
        map.put(codigo, linea);
    }
    public void eliminar(int codigo)
    {
        map.remove(codigo);
    }
}
