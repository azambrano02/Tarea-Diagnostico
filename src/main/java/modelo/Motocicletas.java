package modelo;

public class Motocicletas extends Vehiculos{
    private double hp;
    private double motor;
    private String suspension;
    public double getHp(){
        return this.hp;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public double getMotor(){
        return this.motor;
    }
    public void setMotor(double motor){
        this.motor = motor;
    }
    public String getSuspension(){
        return this.suspension;
    }
    public void setSuspension(String suspension){
        this.suspension = suspension;
    }
    public Motocicletas(String marca, String modelo, int año, int peso, double precio, int stock, double hp, double motor, String suspension){
        super(marca, modelo, año, peso, precio, stock);
        this.hp = hp;
        this.motor = motor;
        this.suspension = suspension;
    }
    public int agregarStock(int stock){
        return (stock+1);
    }
    public int quitarStock(int stock){
        return (stock+1);
    }
    public double velocidadMaxima(double hp, int peso){
        return (((hp*2)/peso)*20);
    }
}
