package model;

import java.util.List;

//Nombre de la clase
public class Persona {
    //Atributos
    protected int idPersona;
    protected String nombre;

    protected String apellidos;

    protected String sexo;

    protected int edad;

    protected String correo;

    protected String telefono;

    protected String direccion;

    //Constructor
    public Persona(String nombre, String apellidos, String sexo, int edad,
                   String correo,String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    // métodos getter y setter

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Método para agregar persona - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarPersona() {
    }

    //Método para modificar persona - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void modificarPersona() {
    }

    //Método para buscar persona - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarPersona() {
    }

    //Método para eliminar persona - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarPersona() {
    }

    //Método para buscar todas las persona - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public List<Persona> allBuscarPersonas(Persona persona) {
        return (List<Persona>) persona;
    }

    //Método para mostrar la infomacion de las personas
    @Override
    public String toString() {
        return
                "\nNombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nSexo: " + sexo +
                "\nEdad: " + edad + " Años" +
                "\nCorreo: " + correo +
                "\nTelefono: " + telefono +
                "\nDireccion: " + direccion;
    }
}
