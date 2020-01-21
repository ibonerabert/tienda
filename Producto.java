/**
 * Crea el producto.
 * 
 * @author (Ibone) 
 * @version (a version number or a date)
 */
public class Producto
{
    private String  nombre;
    private double precio;
    public Producto()
    {
        this.nombre="";
        this.precio=0.0;
        
    }
    /**
     * Este metodo nos da el nombre del producto.
     * @return nos devuelve el valor del nombre.
     * 
     */
    public String getNombre()
    {
        return this.nombre;
    }
    public double getPrecio()
    {
        return this.precio;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    
}
