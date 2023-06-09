public abstract class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    //CONSTRUCTOR
    public Funcionario() {

    }

    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public abstract double getBonificacion();

    //Con super tenemos acceso a los métodos de la clase padre
    //método con sobreescritura (override)

//lo borramos porque ahora funcionario no necesita tener este metodo al ser abstracto
    //public double getBonificacion() {
        //if (this.tipo == 0) {
     //       return this.salario * 0.05;
       // } else if(this.tipo == 1) {
         //   return this.salario;
        //} else {
          //  return 0;
        //}
    //}
}

