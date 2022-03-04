public class main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Rafael");
        Operario operario = new Operario("Juanito");
        Oficial oficial = new Oficial("Vicente");
        Ratero ratero = new Ratero("Gera");

        System.out.println(empleado);
        System.out.println(operario);
        System.out.println(oficial);
        System.out.println(ratero);
    }
}
