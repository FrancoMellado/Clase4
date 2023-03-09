public class Main {
    public static void main(String[] args) {

        Persona cliente1 = new Persona("Maria","Gonzalez",1);

        Producto[] carrito = new Producto[3];

        Producto jabonEnPolvo = new Producto("Jabon En Polvo",40d);
        Producto esponjas = new Producto("Esponjas", 10d);
        Producto chocolates = new Producto("Chocolates",100d);

        carrito[0] = jabonEnPolvo;
        carrito[1] = esponjas;
        carrito[2] = chocolates;

        double total = 0d;
        System.out.println("El carrito pertenece a: "+ cliente1.getNombre()+" "+cliente1.getApellido()+" "+cliente1.getNumSocio()+"\n");

        for(int i = 0 ; i<carrito.length ; i++){
            System.out.println(""+carrito[i].getNombre()+" $"+carrito[i].getPrecio());
            total = total + carrito[i].getPrecio();
        }

        System.out.println("\nEl total por los productos comprados es: ");
        System.out.println("$"+ total);
    }
}