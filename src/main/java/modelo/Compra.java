package modelo;

import java.util.Date;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Vehiculos> vehiculos;
    private Date fechaCompra;

    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public List<Vehiculos> getVehiculos(){
        return this.vehiculos;
    }
    public void setVehiculos(List<Vehiculos> vehiculos){
        this.vehiculos = vehiculos;
    }
    public Date getFechaCompra(){
        return this.fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra){
        this.fechaCompra = fechaCompra;
    }

    public Compra(Cliente cliente, List<Vehiculos> vehiculos, Date fechaCompra) {
        this.cliente = cliente;
        this.vehiculos = vehiculos;
        this.fechaCompra = fechaCompra;
    }

    public void mostrarDetallesCompra() {
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículos comprados: ");
        for (Vehiculos vehiculo : vehiculos) {
            System.out.println(" " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
        double total = 0;
        for (Vehiculos vehiculo : vehiculos) {
            total += vehiculo.getPrecio();
        }
        System.out.println("Total: " + total);
    }
}