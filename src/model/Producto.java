package model;

import java.util.List;

//Nombre de la clase
public class Producto {
    //Atributos
    private int codigo;
    private String nombre;
    private String marca;
    private String referencia;
    private Categoria categoria;
    private int cantidad;
    private double valorUnitario;

    //Constructor
    public Producto(int codigo, String nombre, String marca, String referencia,
                    Categoria categoria, int cantidad, double valorUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.referencia = referencia;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }
    //Metodos getter y setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    //Método para agregar producto - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarProducto() {
    }

    //Método para modificar producto - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void modificarProducto() {
    }

    //Método para buscar producto - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarProducto() {
    }

    //Método para eliminar producto - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarProducto() {
    }

    //Método para buscar todos los Productos - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public List<Producto> allBuscarProducto(Producto producto) {
        return (List<Producto>) producto;
    }

    /* Método que nos permite
     obtener la información del(objecto) de los productos
        */
    public String mostrarInformacionProducto() {
        return "-----------------------" +
                "\nDatos del Producto" +
                "\nCodigo Producto: " + codigo +
                "\nNombre del producto: " + nombre +
                "\nMarca del producto: " + marca +
                "\nReferencia del producto: " + referencia +
                "\nCategoria del producto: " + categoria.getNombre() +
                "\nDescripcion del producto: " + categoria.getDescripcion() +
                "\nCantidad: " + cantidad +
                "\nValor Unitario: " + valorUnitario;
    }
}
