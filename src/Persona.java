import java.time.LocalDate;

public class Persona {
    //Atributo
    private String nombre;
    private String apellido;
    private LocalDate fechaDeAlta;
    private Integer numSocio;

    //Constructor
    public Persona(String nombre, String apellido, Integer numSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeAlta = fechaDeAlta.now();
        this.numSocio = numSocio;
    }
    //Methodos

    public String getNombre() {

        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public LocalDate getFechaDeAlta(){

        return this.fechaDeAlta;
    }
    public Integer getNumSocio(){

        return this.numSocio;
    }
}
