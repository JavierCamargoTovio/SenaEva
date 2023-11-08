package model;

//Nombre de la clase
public class DetalleFactura {

    //Atributos
    private int idDetalleFactura;
    private Producto producto;
    private int cantidad;

    //Constructor
    public DetalleFactura(int idDetalleFactura, Producto producto, int cantidad) {
        this.idDetalleFactura = idDetalleFactura;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //metodos getter y setter

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Método para agregar detalle de la factura - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void agregarDetalleFactura() {
    }

    //Método para modificar detalle de la factura  - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void modificarDetalleFactura() {
    }

    //Método para buscar detalle de la factura  - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void buscarDetalleFactura() {
    }

    //Método para eliminar detalle de la factura  - lo dejamos vació por momento para luego ir desarrollando su funcionalidad
    public void eliminarDetalleFactura() {
    }
    public double calcularSubtotal(double valorUnitario, int cantidad) {
        return valorUnitario * cantidad;
    }

    /* Método que nos proporciona la clase Object, la cual nos permite
           obtener la información(objecto) de los detalles
            */
    @Override
    public String toString() {
        return "\n-----------------------" +
                "\nID Detalle Factura: " + idDetalleFactura +
                "\nCodigo Producto: " + producto.getCodigo() +
                "\nNombre Producto: " + producto.getNombre() +
                "\nValor Unitario Producto: " + producto.getValorUnitario() +
                "\nCantidad: " + cantidad +
                "\nImporte: " + calcularSubtotal(producto.getValorUnitario(), cantidad);

    }
}
