package cuenta;
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }

    /**
     * Constructor parámetrizado
     * @param nom parámetro para ingresar un nombre a el constructor del objeto
     * @param cue parámetro para asignar un numero de cuenta
     * @param sal Parámetro para ingresar el saldo de la cuenta
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Metódo para asignar nombre
     * @param nom parámetro para asignar un nombre
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Metódo obtener nombre
     * @return devulve el getter del nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Metodo estado de tipo double
     * @return devuelve el saldo actual
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo obtener cuenta
     * @return devulve el numero de cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Metodo ingresar
     * @param cantidad parametro que se utiliza para evaluar dentro del metodo
     * @throws Exception si se cumple una condición dada dentro del metodo, mostrará un mensaje por pantalla.
     */

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metódo retirar
     * @param cantidad Parámetro de la cantidad que se va a retirar
     * @throws Exception  si se cumple una condición dada dentro del metodo, mostrará un mensaje por pantalla.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Metodo getter de nombre
     * @return devulve el nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter de nombre
     * @param nombre Otorga el nombre ingresado al atributo de la clase
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Metodo getter de el numero de cuenta
     * @return devuelve el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo setter de cuenta
     * @param cuenta Otorga una cadena de numero y guiones al atributo de la clase
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo getter de saldo
     * @return devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo setter del saldo
     * @param saldo Otorga un saldo en numeros al atributo de la clase
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *Metodo getter del tipo de interes
     * @return devuelve el tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo setter del tipo de interes
     * @param tipoInteres Parámetro del tipo double que asigna un valor al atributo de la clase
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
