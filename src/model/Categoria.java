package model;

//Nombre d ela clase
public class Categoria {
    //Atributos
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private String estado;

    //Constructor
    public Categoria(int idCategoria, String nombre, String descripcion, String estado) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //Métodos getter y setter


    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Método para agregar categoria - por ahora quedará vacio mas tarde implementaremos el método
    public void agregarCategoria(){}

    //Método para modificar categoria - por ahora quedará vacio mas tarde implementaremos el método
    public void modificarCategoria(){}

    //Método para buscar categoria - por ahora quedará vacio mas tarde implementaremos el método
    public void buscarCategoria(){}

    //Método para eliminar categoria - por ahora quedará vacio mas tarde implementaremos el método
    public void eliminarCategoria(){}

    //Método para mostrar la información de la categoria
    public String mostrarInformacionCategoria(){
        return "----------------------------" +
                "\nDatos de la Categoria " +
                "\nId Categoria: " + idCategoria +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado;
    }
}
