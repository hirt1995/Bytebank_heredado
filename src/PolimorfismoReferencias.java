public class PolimorfismoReferencias {
    public static void main(String[] args) {
        //podemos adaptar al elemento mas general al mas especifico
        //m la clase funcionario le hereda a gerente sus atributos
        //Entonces podemos realizar una referencia
        //Funcionario no puede tener los metodos de gerente, a pesar
        // de que se crea un nuevo gerente, por tanto, tenemos que
        //crear un nuevo gerente para poder usar el método de iniciar sesióm

        Funcionario funcionario = new Gerente();
        funcionario.setNombre("hugo");
        Gerente gerente = new Gerente();
        gerente.setNombre("isaac");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
        gerente.iniciarSesion("_fdfdfdfd")
;
    }
}
