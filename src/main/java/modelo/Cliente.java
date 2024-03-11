package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String rut;
    private String direccion;
    private List<Vehiculos> vehiculos;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRut(){
        return this.rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public List<Vehiculos> getVehiculos(){
        return this.vehiculos;
    }
    public void setVehiculos(List<Vehiculos> vehiculos){
        this.vehiculos = vehiculos;
    }
    public Cliente(String nombre, String rut, String direccion){
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.vehiculos = new ArrayList<>();
    }
    public void agregarVehiculo(Vehiculos vehiculo){
        this.vehiculos.add(vehiculo);
    }
    public void eliminarVehiculos(Vehiculos vehiculo){
        this.vehiculos.remove(vehiculo);
    }
}