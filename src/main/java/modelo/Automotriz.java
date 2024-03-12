package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Automotriz {
    private List<Vehiculos> vehiculos;
    private List<Cliente> clientes;
    private List<Compra> compras;

    public List<Vehiculos> getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public List<Compra> getCompras(){
        return this.compras;
    }
    public void setCompras(List<Compra> compras){
        this.compras = compras;
    }
    public Automotriz() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public boolean agregarCliente(Cliente cliente) {
        if (!clienteExiste(cliente)) {
            this.clientes.add(cliente);
            System.out.println("EL cliente ha sido registrado con exito");
            return true;
        } else {
            System.out.println("El cliente no ha podido ser registrado");
            return false;
        }
    }

    public boolean clienteExiste(Cliente cliente) {
        for (Cliente c : this.clientes) {
            if (cliente.getRut().equals(c.getRut())) {
                return true;
            }
        }
        return false;

    }

    public boolean agregarVehiculo(Vehiculos vehiculo) {
        if (!vehiculoExiste(vehiculo)) {
            this.vehiculos.add(vehiculo);
            System.out.println("El vehiculo ha sido agregado con exito");
            return true;
        } else {
            System.out.println("El vehiculo no ha podido ser agregado");
            return false;
        }
    }

    public boolean vehiculoExiste(Vehiculos vehiculo) {
        for (Vehiculos v : this.vehiculos) {
            if (vehiculo.getModelo().equals(v.getModelo())) {
                return true;
            }
        }
        return false;
    }
    public Vehiculos buscarVehiculosMarca(String marca){
        for (Vehiculos vehiculo : this.vehiculos){
            if(vehiculo.getMarca().equals(marca)){
                return vehiculo;
            }
        }
        return null;
    }
    public Vehiculos buscarVehiculosModelo(String modelo) {
        for (Vehiculos vehiculo : this.vehiculos) {
            if (vehiculo.getModelo().equals(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }
    public List<Vehiculos> buscarVehiculosTipo(TipoVehiculo tipoVehiculo) {
        List<Vehiculos> vehiculosTipo = new ArrayList<>();
        for (Vehiculos vehiculo : this.vehiculos) {
            if (vehiculo.getTipo().equals(tipoVehiculo)) {
                vehiculosTipo.add(vehiculo);
            }
        }
        return vehiculosTipo;
    }
    public void Compra(Cliente cliente, List<Vehiculos> vehiculos) {
        if (cliente != null && !vehiculos.isEmpty()) {
            Compra compra = new Compra(cliente, vehiculos, new Date());
            compras.add(compra);
            for(Vehiculos vehiculo : vehiculos){
                vehiculo.quitarStock();
            }
            compra.mostrarDetallesCompra();
        }
    }
}


