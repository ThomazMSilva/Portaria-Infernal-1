package Backend;

public class Prestador {
    // atributos
    private int id;
    private String nome, cpf, contato;

    public Prestador(int id, String nome, String cpf, String contato) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getContato() {return contato;}

    public void setContato(String contato) {this.contato = contato;}

    @Override
    public String toString() {
        return "Prestador{" + "id=" + id + ", nome="
        +nome + ", cpf=" + cpf + ", contato=" + contato + '}';
    }
    
    
}
