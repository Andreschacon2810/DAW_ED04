package cuenta;
public class Main {

    public static void main(String[] args) {

        int operacion=0;
        float cantidad=0;
        operativa_cuenta(operacion, cantidad);
    }
    public static void operativa_cuenta(int operacion, float cantidad){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Juan López","1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuenta1.retirar(2300);
            System.out.println("El nuevo saldo es: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Abono en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

    }

}
