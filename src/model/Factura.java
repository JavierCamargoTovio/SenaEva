package model;

import java.util.ArrayList;
import java.util.Date;

//Nombre de la clase
public class Factura {

    //Atributos
    private int idFactura;
    private Date fechaFactura;
    private Cliente cliente;
    private Usuario usuario;

    private ArrayList<DetalleFactura> detalleFactura;

    //Constructor


    public Factura(int idFactura, Date fechaFactura, Cliente cliente, Usuario usuario, ArrayList<DetalleFactura> detalleFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.usuario = usuario;
        this.detalleFactura = detalleFactura;
    }

    //Metodos getter y setter


    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    //Método para calcular total factura  - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void totalFactura() {
    }
    public double calcularSubtotalFactura(double valorUnitario, int cantidad) {
        return valorUnitario * cantidad;
    }

    /* Método que nos permite
     obtener la información del(objecto) de los productos
        */
    public String mostrarInformacionFactura() {
        return "-----------------------" +
                "\nDatos de la Factura" +
                "\nId Factura: " + idFactura +
                "\nFecha Factura: " + fechaFactura +
                "\nID Cliente " + cliente.getIdCliente() +
                "\nNombre Cliente " + cliente.getNombre() +
                "\nNombre Usuario " + usuario.getNombre() +
                "\n-----------------------" +
                "\nDetalles de la factura: " + detalleFactura;

    }

}
