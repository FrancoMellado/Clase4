import java.time.*;

public class Producto {

    //Atributo
    //Utilizamos private porque queremos mantener las variables encapsuladas
    private String nombre;
    private String descripcion;
    private final LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;

    //Constructor
    //private static final Double minPrecio = 0.1; //Podemos definir un precio minimo si no fijamos uno, para no crearlo vacio
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = precio;
    }
    //Methodos
        public String getNombre() {

            return this.nombre;
        }
        public String getDescripcion() {

            return this.descripcion;
        }
        public void setDescripcion(String descripcion) {

            this.descripcion = descripcion;
        }
        public Double getPrecio(){
            return this.precio;
        }
    }

