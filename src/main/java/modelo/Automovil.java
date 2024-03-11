package modelo;

public class Automovil extends Vehiculos{
    private double hp;
    private int puertas;
    private double motor;
    public double getHp(){
        return this.hp;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public double getMotor(){
        return this.motor;
    }
    public void setMotor(double motor){
        this.motor = motor;
    }

    public Automovil(String marca, String modelo, int año, int peso, double precio, int stock, double hp, int puertas, double motor){
        super(marca,modelo,año,peso,precio,stock);
        this.hp = hp;
        this.puertas = puertas;
        this.motor = motor;
    }

    public double velocidadMaxima(double hp, int peso){
        return ((hp/peso)*10);
    }
    public TipoVehiculo getTipo() {
        return TipoVehiculo.AUTOMOVIL;
    }
}
