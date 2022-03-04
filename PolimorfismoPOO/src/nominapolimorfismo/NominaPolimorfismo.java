
package nominapolimorfismo;


public class NominaPolimorfismo {

    
    public static void main(String[] args) {
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Susana",
        "Pérez","222-22-222",10000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Roberto",
        "González","333-33-333",5000,.04,300);
        System.out.printf( "%s %s:\n\n%s\n\n","Llamada a toString de EmpleadoPorComision con referencia de superclase ",
                "a un objeto de la superclase", empleadoPorComision.toString());
        System.out.printf( "%s %s:\n\n%s\n\n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subclase a un objeto de la subclase",empleadoBaseMasComision.toString());
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;
        EmpleadoBaseMasComision empleadoPorComision3 = empleadoBaseMasComision;
        System.out.printf("%s %s:\n\n%s\n","Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
        "a un objeto de la subclase", empleadoPorComision2.toString() );
        System.out.printf("%s %s:\n\n%s\n","\nLlamada a toString de EmpleadoBaseMasComision con referencia de subClase",
        "a un mismo objeto", empleadoPorComision3.toString() );
    }
    
}
