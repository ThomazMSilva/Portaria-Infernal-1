package Backend;

public class Evento {
    // atributos
    private int id, id_residente, id_prestador, taxa_de_perigo;
    private String nome;

    public Evento(int id, int id_residente, int id_prestador, int taxa_de_perigo, String nome) {
        this.id = id;
        this.id_residente = id_residente;
        this.id_prestador = id_prestador;
        this.taxa_de_perigo = taxa_de_perigo;
        this.nome = nome;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getId_residente() {return id_residente;}

    public void setId_residente(int id_residente) {this.id_residente = id_residente;}

    public int getId_prestador() {return id_prestador;}

    public void setId_prestador(int id_prestador) {this.id_prestador = id_prestador;}

    public int getTaxa_de_perigo() {return taxa_de_perigo;}

    public void setTaxa_de_perigo(int taxa_de_perigo) {this.taxa_de_perigo = taxa_de_perigo;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", id_residente="
        + id_residente + ", id_prestador=" + id_prestador
        + ", taxa_de_perigo=" + taxa_de_perigo + ", nome=" + nome + '}';
    }
   
}
