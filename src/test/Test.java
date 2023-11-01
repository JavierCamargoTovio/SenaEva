package test;

import model.*;

public class Test {
    public static void main(String[] args) {

        //Se crea la instancia del objecto Cliente
        Cliente cliente1 = new Cliente(12, "Pepito", "Perez", "Masculino", 56,
        "pepito@gmail.com", "32115555","Calle 56");

        System.out.println(cliente1);

        //Se crea la instancia del objecto Proveedor
        Persona proveedor1 = new Proveedor(1, "Alice", "Camargo", "Femenino",
                2,"alice@gmail.com", "30255553","Medellin");

        System.out.println(proveedor1);

        //Se crea la instancia del objecto Usuario
        Persona usuario1 = new Usuario(123, "Eva Sandrith", "Requena Fuertes", "Femenino",
                28,"evarequena@gmail.com", "30155553","Medellin", "Activo", "Administrador");

        System.out.println(usuario1);

        //Se crea la instancia del objecto Categoria
        Categoria Categoria01 = new Categoria(12345, "Cementos", "Cementos gris", true);
        System.out.println(Categoria01.mostrarInformacion());

        //Se crea la instancia del objecto Producto
        Producto producto01 = new Producto(7878, "Cementos", "Argos", "CEM001", Categoria01, 20, 25600);
        System.out.println(producto01.mostrarInformacionProducto());
    }

}
