

/**
 * Write a description of class linia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class linea
{
    // instance variables - replace the example below with your own
    private Producto producto;
    private int cantidad;
    /**
     * Constructor for objects of class linia
     */
    public linea(Producto producto, int cantidad)
    {
      this.producto=producto;
      this.cantidad=cantidad;
    }
    public double getPrecioTotal(int cantidad)
    {
        return cantidad*producto.getPrecio();
    }
}
