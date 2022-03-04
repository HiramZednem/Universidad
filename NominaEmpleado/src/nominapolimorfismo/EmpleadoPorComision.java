
package nominapolimorfismo;


public class EmpleadoPorComision{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    //Constructor por defecto
    public EmpleadoPorComision(){   
    }
    
    // constructor con cinco argumentos
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) {
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    }

    public void establecerPrimerNombre(String nombre ){
        primerNombre = nombre;
    }


    public String obtenerPrimerNombre(){
        return primerNombre;
    }


    public void establecerApellidoPaterno(String apellido ){
        apellidoPaterno = apellido;
    }


    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }


    public void establecerNumeroSeguroSocial(String nss ){
        numeroSeguroSocial = nss; // debe validar
    }


    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }


    public void establecerVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    }

    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }


    public void establecerTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    }


    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    // calcula los ingresos
    //método polimófico
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision3
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
                "numero de seguro social", obtenerNumeroSeguroSocial(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comision", obtenerTarifaComision(),
                "sueldo más comisión",ingresos()); 
    } // fin del método toString
 }