

/**
 * Crearemos una clase llamada linea donde la utilizaremos en otras clases.
 * Tiene 2 variables un Producto y un entero
 * @author (Ibone) 
 * @version (a version number or a date)
 */
public class linea
{
    // instance variables - replace the example below with your own
    private Producto producto;
    private int cantidad;
    /**
     * Inicializaremos las variables que hemos creado anteriormente
     * @param un Producto y un entero
     */
    public linea(Producto producto, int cantidad)
    {
      this.producto=producto;
      this.cantidad=cantidad;
    }
    /**
     * En este metodo queremos obtener como se obtiene el producto al realizar una compra.
     * El precio admite decimales
     * @param Utiliza un entero
     * @return devuelve el precio del producto
     */
    public double getPrecioTotal(int cantidad)
    {
        return cantidad*producto.getPrecio();
    }
}
