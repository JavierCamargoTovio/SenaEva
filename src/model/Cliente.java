package model;

import java.util.List;

//Nombre de la clase - heredamos información de la clase Persona
public class Cliente extends Persona{

    //Atributos
    private int idCliente;

    //Constructor
    public Cliente( int idCliente, String nombre, String apellidos, String sexo, int edad,
                    String correo, String telefono, String direccion) {
        super(nombre, apellidos, sexo,edad,correo, telefono, direccion);
        this.idCliente = idCliente;
    }
    //Método getter y setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    //Método para agregar Cliente - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarCliente() {
    }

    //Método para modificar Cliente - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void modificarCliente() {
    }

    //Método para buscar Cliente - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarCliente() {
    }

    //Método para eliminar Cliente - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarCliente() {
    }

    //Método para buscar todos los Clientes - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public List<Cliente> allBuscarClientes(Cliente cliente) {
        return (List<Cliente>) cliente;
    }

    /* Método que nos proporciona la clase Object, la cual nos permite
       obtener la información(objecto) de los clientes
     */
    @Override
    public String toString() {
        return "-----------------------" +
                "\nDatos del Cliente" +
                "\nID Cliente: " + idCliente +
                super.toString();

    }
}
