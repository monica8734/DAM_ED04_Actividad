package dam_ed04_actividad;

/**
 * @author Mónica Mallén
 * @since 06.02.2021
 * Clase que será la parte principal de la aplicación de cuentas bancarias.
 */

public class Main {
    
    /**
     * Método main creado para llevar el control de las cuentas bancarias que queramos crear.
     * Se llama al método operativa_cuenta donde se lleva a cabo la creación de la cuenta.
     * @param args Parámetros pasados al método main.
     */
    public static void main(String[] args) {
        operativa_cuenta(0.0F);
    }
    
    
    /**
     * Método operativa_cuenta donde se crea la cuenta bancaria con sus atributos.
     * Este método nos permite retirar e ingresar un importe pasado por parámetro,
     * llamando a los métodos de la clase CCuenta.
     * @param cantidad 
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
