//vamos a aplicar la herencia en la clase de la siguiente manera
//todo lo declarado como es repetitivo lo podemos borrar
public class Gerente extends Funcionario implements Autenticable {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "PruebaOnline";
    }

    //Con super tenemos acceso a los métodos de la clase padre
    //método con sobreescritura (override)

    public double getBonificacion() {
        System.out.println("ejecutandose desde gerente");
        return super.getSalario() + (this.getSalario() * 0.05) ;
    }
}
