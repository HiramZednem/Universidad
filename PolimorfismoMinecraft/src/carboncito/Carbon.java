package carboncito;

public class Carbon extends Bloque{
    public Carbon(String nombre, String textura, String dimension){
        super(nombre,textura,dimension);
    }

    public void Destruir() {
        System.out.println("Toma un carboncito");
    }

    @Override
    public void Colocar() {
        super.Colocar();
        System.out.println("Y soy un bloque muuuy negro");
    }
}
