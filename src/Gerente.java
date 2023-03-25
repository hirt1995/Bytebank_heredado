//vamos a aplicar la herencia en la clase de la siguiente manera
//todo lo declarado como es repetitivo lo podemos borrar
public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "Alura";
    }

    //Con super tenemos acceso a los métodos de la clase padre
    //método con sobreescritura (override)
    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo del Contador");
        return super.getSalario() + (super.getBonificacion()) ;
    }
}
