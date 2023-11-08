package test;

import model.Categoria;

public class Test {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria(12, "Cementos", "Cementos gris x 50kg", "Activo");
        System.out.println(categoria1.mostrarInformacionCategoria());
    }
}
