/**
 * Crea el producto.
 * Hay que crear las variables que vamos a utilizar en el producto como el nombre y el precio.
 * @author (Ibone) 
 * @version (a version number or a date)
 */
public class Producto
{
    private String  nombre;
    private double precio;
    public Producto()
    /**
     * Tenemos que inicializar las variables que vamos a utilizar en los siguientes metodos. 
     */
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
    /**
     * Este metodo nos da el valor del producto (Acepta decimales)
     * @return nos devuelve el valor del producto
     */
    public double getPrecio()
    {
        return this.precio;
    }
    /**
     * Este metodo nos sirve para asignar un valor inicial a un atributo pero de forma explicita. 
     * @param Utiliza una cadena 
     */
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    /**
     * Este metodo nos sirve para asignar un valor precio a un atributo de forma explicita.
     * @param Utiliza un double para el precio
     */
    public void setPrecio(double precio)
    {
        this.precio=precio;
    }
    
}
