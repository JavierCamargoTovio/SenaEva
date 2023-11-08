package model;

//Nombre de la clase
public class Categoria {
    //Atributos
    private int codigo;
    private String nombre;
    private String descripcion;
    private boolean estado;

    //Constructor

    public Categoria(int codigo, String nombre, String descripcion, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //Métodos getter y setter

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Método para agregar una categoria - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarCategoria() {
    }
    //Método para buscar una categoria - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarCategoria() {
    }

    //Método para modificar una categoria - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void editarCategoria() {
    }
    //Método para eliminar una categoria - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarCategoria() {
    }

    /* Método que nos permite
     obtener la información del(objecto) de los productos
        */
    public String mostrarInformacion() {
        return "-----------------------" +
                "\nDatos de la Categoria" +
                "\nCodigo Categoria: " + codigo +
                "\nNombre de la Categoria: " + nombre +
                "\nDescripcion de la Categoria: " + descripcion +
                "\nEstado de la Categoria: " + estado;
    }
}
