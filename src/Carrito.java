import java.time.*;
public class Carrito {

    //Atributos
    private Persona socioN;
    private Producto[] productos;
    private LocalDate fecha;

    //Constructor
    public Carrito(Persona socioN,Producto[] productos){
        this.socioN = new Persona(socioN.getNombre(), socioN.getApellido(), socioN.getNumSocio());
        this.productos = new Producto[3];
        this.fecha = LocalDate.now();
    }
    //Metodos
    public Producto[] getProductos() {
        return this.productos;
    }
}
