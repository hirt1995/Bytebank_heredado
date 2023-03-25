public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario hugo = new Funcionario();
        hugo.setNombre("Hugo");
        hugo.setDocumento("1116800954");
        hugo.setSalario(2000);
        hugo.setTipo(0);

        System.out.println(hugo.getSalario());
        System.out.println(hugo.getBonificacion());
    }
}
