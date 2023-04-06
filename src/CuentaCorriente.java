public class CuentaCorriente extends Cuenta{
    //contructor
    public CuentaCorriente(int agencia, int numero){
        //llamamos con super al constructor de la clase padre para mantener
        //las condiciones de la clase padre en la clase hija
        super(agencia, numero);
    }
    //sobreescribimos el método sacar

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor + comision);
    }
}
