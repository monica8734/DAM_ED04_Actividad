package dam_ed04_actividad;

/**
 * @author Mónica Mallén
 * @since 06.02.2021
 * Clase creada para configurar una cuenta bancaria, con el nombre, cuenta, saldo y tipo de interés.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * @return cuenta Devuelve la cuenta que tengamos creada.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Modifica la cuenta con la información que pasemos.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo Devuelve el saldo que tengamos en nuestra cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Modifica el saldo de nuestra cuenta al importe que indiquemos.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor que creamos para asignar los parámetros a los atributos del objeto CCuenta.
     * @param nom Nombre que pasamos por parámetro y será el atributo de nuestra cuenta bancaria.
     * @param cue Número de cuenta que pasamos por parámetro y será el atributo de nuestra cuenta bancaria.
     * @param sal Saldo que pasamos por parámetro y será el atributo de nuestra cuenta bancaria.
     * @param tipo Tipo de interés que pasamos por parámetro y será el atributo de nuestra cuenta bancaria.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método tipo setter que asigna el nombre que pasemos por parámetro, al nombre de la cuenta.
     * @param nom Nombre que pasamos por parámetro, será el titular de la cuenta.
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método getter para obtener el nombre de la cuenta.
     * @return getNombre() Se llama al método getNombre para obtener el nombre.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método getter para obtener el saldo de la cuenta.
     * @return getSaldo() Se llama al método getSaldo para obtener el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método setter que permite ingresar una cantidad en la cuenta.
     * Controla la cantidad que indiquemos como parámetro y si es negativa lanza una excepción.
     * Si la cantidad es positiva, se añade al saldo de nuestra cuenta bancaria.
     * @param cantidad Cantidad que deseamos ingresar.
     * @throws Exception en caso de que la cantidad sea negativa, se lanza excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método setter que permite retirar una cantidad en la cuenta.
     * Controla la cantidad que indiquemos como parámetro:
     * si es negativa o es superior a nuestro saldo, lanza una excepción.
     * Si la cantidad se puede retirar, la resta al saldo de nuestra cuenta bancaria.
     * @param cantidad Cantidad que queremos retirar de la cuenta.
     * @throws Exception Si no es posible sacar esa cantidad de dinero, se lanza excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método getter para obtener el número de cuenta, llama al método getter getCuenta.
     * @return getCuenta()
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método getter para obtener el nombre del titular de la cuenta.
     * @return getNombre()
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del titular de la cuenta.
     * @param nombre El nombre que pasamos por parámetro lo asigna al atributo nombre de la cuenta. 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el tipo de interés de la cuenta.
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para establecer el tipo de interés de la cuenta.
     * @param tipoInterés El tipo de interés que pasemos por parámetro será el que se
     * establezca en el atributo de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
