package model;

import java.util.List;

//Clase que hereda de clase Persona - utilizamos extends
//Nombre de la clase
public class Proveedor extends Persona{

    //Atributos
    private int idProveedor;

    //Constructor
    public Proveedor(int idProveedor,String nombre, String apellidos, String sexo, int edad,String correo, String telefono, String direccion) {
        super(nombre, apellidos, sexo, edad,correo, telefono, direccion);
        this.idProveedor = idProveedor;
    }

    //Getter y setter


    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    //Método para agregar Proveedor - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarProveedor() {
    }

    //Método para modificar Proveedor - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void modificarProveedor() {
    }

    //Método para buscar Proveedor - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarProveedor() {
    }

    //Método para eliminar Proveedor - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarProveedor() {
    }

    //Método para buscar todos los proveedores - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public List<Proveedor> allBuscarProveedores(Proveedor proveedor) {
        return (List<Proveedor>) proveedor;
    }

    /* Método que nos proporciona la clase Object, la cual nos permite
       obtener la información(objecto) de los proveedores
        */
    @Override
    public String toString() {
        return "-----------------------" +
                "\nDatos del Proveedor" +
                "\nID Proveedor: " + idProveedor +
                super.toString();

    }
}
