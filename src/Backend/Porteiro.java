package Backend;

public class Porteiro {
    // atributos
    private int id, vida, mana, dias_de_servico;
    private String nome, senha;
    private boolean vivo;

    public Porteiro(int id, int vida, int mana, int dias_de_servico, String nome, String senha) {
        this.id = id;
        this.vida = vida;
        this.mana = mana;
        this.dias_de_servico = dias_de_servico;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getVida() {return vida;}

    public void setVida(int vida) {this.vida = vida;}

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public int getDias_de_servico() {return dias_de_servico;}

    public void setDias_de_servico(int dias_de_servico) {this.dias_de_servico = dias_de_servico;}
    
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public boolean isVivo() {return vivo;}

    public void setVivo(boolean vivo) {this.vivo = vivo;}

    @Override
    public String toString() {
        return "Porteiro{" + "id=" + id + ", vida=" + vida +
        ", mana=" + mana + ", dias_de_servico=" + dias_de_servico +
        ", nome=" + nome + ", senha=" + senha + ", vivo=" /*+ vivo*/+ '}';
    }
    
    
    
}
