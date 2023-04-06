public class Cliente implements Autenticable {
    private String nombre;
    private String telefono;
    private String documento;

    private AutenticacionUtil util;

    //composicion de objetos
    public Cliente(){
        this.util = new AutenticacionUtil();
    }

    //generamos los getter y setter de las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
