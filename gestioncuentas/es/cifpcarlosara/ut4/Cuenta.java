package gestioncuentas.gestioncuentas.es.cifpcarlosara.ut4;

/**
 * Descripción cuenta
 * @author
 * @version
 */
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta() {
        setSaldo(0);
    }



    /**
     * Drescripcion
     * @param
     * @return
     */

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }


    /**
     * Descripcion metodo retirarControl
     * @param cantidad
     * @return
     */

    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
