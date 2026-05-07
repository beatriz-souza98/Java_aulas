package abstração;

public class Funcionario extends Endereco implements Pessoas{

    private String nome;
    private String documento;
    private String cargo;

    public Funcionario(String rua, String numero, String cidade, String estado, String cep, String nome, String documento, String cargo) {
        super(rua, numero, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.nome = documento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
@Override
    public void mostrarEndereco(){
        System.out.println("O endereço do funcionário é: " + getRua() + getNumero() + getCidade() + getEstado() + getCep());
    }
}
