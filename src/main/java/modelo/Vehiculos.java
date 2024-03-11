package modelo;

public abstract class Vehiculos {
    protected String marca;
    protected String modelo;
    protected int año;
    protected int peso;
    protected double precio;
    protected int stock;
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAño(){
        return this.año;
    }
    public void setAño(int año){
        this.año = año;
    }
    public int getPeso(){
        return this.peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public Vehiculos(String marca, String modelo, int año, int peso, double precio, int stock){
        this.marca =marca;
        this.modelo = modelo;
        this.año = año;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }
}
