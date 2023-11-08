package test;

import model.*;

import java.util.ArrayList;
import java.util.Date;



public class Test {
    public static void main(String[] args) {

        //Se crea la instancia del objecto Cliente
        Cliente cliente1 = new Cliente(12, "Pepito", "Perez", "Masculino", 56,
        "pepito@gmail.com", "32115555","Calle 56");

        //System.out.println(cliente1);

        //Se crea la instancia del objecto Proveedor
        Proveedor proveedor1 = new Proveedor(1, "Alice", "Camargo", "Femenino",
                2,"alice@gmail.com", "30255553","Medellin");

        //System.out.println(proveedor1);

        //Se crea la instancia del objecto Usuario
        Usuario usuario1 = new Usuario(123, "Eva Sandrith", "Requena Fuertes", "Femenino",
                28,"evarequena@gmail.com", "30155553","Medellin", "Activo", "Administrador");

        //System.out.println(usuario1);

        //Se crea la instancia del objecto Categoria
        Categoria Categoria01 = new Categoria(12345, "Cementos", "Cementos gris", true);
        Categoria Categoria02 = new Categoria(12346, "tubo", "Tubo amarrillo agua residuales", true);
        //System.out.println(Categoria01.mostrarInformacion());

        //Se crea la instancia del objecto Producto
        Producto producto01 = new Producto(7878, "Cementos", "Argos", "CEM001", Categoria01, 20, 25600);
        Producto producto02 = new Producto(7879, "Tubos", "DELTA", "TB001", Categoria02, 2, 14000);
       // System.out.println(producto01.mostrarInformacionProducto());


        //Se crea la instancia del objecto detalleFactura
        DetalleFactura detalleFactura01 = new DetalleFactura(1, producto01, 5);
        //System.out.println(detalleFactura01);
        DetalleFactura detalleFactura02 = new DetalleFactura(2, producto02, 6);
       // System.out.println(detalleFactura02);

        ArrayList<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
        detalles.add(detalleFactura01);
        detalles.add(detalleFactura02);

        //Se crea la instancia del objecto Factuta
        Factura factura01 = new Factura(1, new Date(),cliente1,usuario1, detalles);
        System.out.println(factura01.mostrarInformacionFactura());


       double subtotal = factura01.calcularSubtotalFactura(producto01.getValorUnitario(), detalleFactura01.getCantidad()) +
               factura01.calcularSubtotalFactura(producto01.getValorUnitario(), detalleFactura02.getCantidad());

        System.out.println("**********************************");
        System.out.println("Subtotal de la Factura: " + subtotal);
        System.out.println("**********************************");

    }



}
