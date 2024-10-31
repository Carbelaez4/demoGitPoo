public class Automovil  extends Vehiculo{
    private boolean descapotable;

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
    public void cambioAceite(){
        System.out.println("Se cambio aceite al automovil");
    }
}
