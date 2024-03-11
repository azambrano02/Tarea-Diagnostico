package modelo;

public class Bicicletas extends Vehiculos{
    public String material;
    public double fuerzaPedaleo;
    public int velocidades;
    public String getMaterial(){
        return this.material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public double getFuerzaPedaleo(){
        return this.fuerzaPedaleo;
    }
    public void setFuerzaPedaleo(double fuerzaPedaleo){
        this.fuerzaPedaleo = fuerzaPedaleo;
    }
    public int getVelocidades(){
        return this.velocidades;
    }
    public void setVelocidades(int velocidades){
        this.velocidades = velocidades;
    }
    public Bicicletas(String marca, String modelo, int año, int peso, double precio, int stock, String material, double fuerzaPedaleo, int velocidades){
        super(marca, modelo, año, peso, precio, stock);
        this.material = material;
        this.fuerzaPedaleo = fuerzaPedaleo;
        this.velocidades = velocidades;
    }
    public int agregarStock(int stock){
        return (stock+1);
    }
    public int quitarStock(int stock){
        return (stock+1);
    }
    public double velocidadMaxima(double fuerzaPedaleo, int peso){
        return (((fuerzaPedaleo/peso)*100)+10);
    }
}
