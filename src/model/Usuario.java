package model;

import java.util.List;

/* Nombre de la clase
 * Esta clase hereda de la clase Persona, entonces es una subclase o clase hija
 */
public class Usuario extends Persona{
    //Atributos
    private int idUsuario;
    private String estado;
    private String tipo;

    //Constructor
    public Usuario( int idUsuario, String nombre, String apellidos, String sexo, int edad,
                   String correo, String telefono, String direccion, String estado, String tipo) {
        super(nombre, apellidos, sexo, edad, correo, telefono, direccion);
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.tipo = tipo;
    }

    //Métodos getter y setter

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Método para registrar usuarios
    public void registrar(){
    }
    //Metodo para editar usuarios
    public void editar(){
    }
    //Metodo para eliminar usuarios
    public void eliminar(){
    }
    //Metodo para Buscar usuarios
    public void Buscar(){
    }
    //Métodos para listar todos los usuarios
    public List<Usuario> listarUsuario(Usuario usuario){
        return (List<Usuario>) usuario;
    }

    /* Método que nos proporciona la clase Object, la cual nos permite
    obtener la información(objecto) de los usuarios
     */
    @Override
    public String toString() {
        return "-----------------------" +
                "\nDatos del Usuario " +
                "\nId usuario: " + idUsuario +
                super.toString();
    }
}
