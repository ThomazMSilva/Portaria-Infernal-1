package Backend;

public class Residente {
    
    // atributos
    private int id, id_casa, vida;
    private String nome, raca, temperamento;
    private boolean vivo, fora;

    public Residente(int id, int id_casa, int vida, String nome, String raca, String temperamento, boolean vivo, boolean fora) {
        this.id = id;
        this.id_casa = id_casa;
        this.vida = vida;
        this.nome = nome;
        this.raca = raca;
        this.temperamento = temperamento;
        this.vivo = vivo;
        this.fora = fora;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getId_casa() {return id_casa;}

    public void setId_casa(int id_casa) {this.id_casa = id_casa;}

    public int getVida() {return vida;}

    public void setVida(int vida) {this.vida = vida;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getRaca() {return raca;}

    public void setRaca(String raca) {this.raca = raca;}

    public String getTemperamento() {return temperamento;}

    public void setTemperamento(String temperamento) {this.temperamento = temperamento;}

    public boolean isVivo() {return vivo;}

    public void setVivo(boolean vivo) {this.vivo = vivo;}

    public boolean isFora() {return fora;}

    public void setFora(boolean fora) {this.fora = fora;}

    @Override
    public String toString() {
        return "Residente{" + "id=" + id + ", id_casa="
        + id_casa + ", vida=" + vida + ", nome=" + nome
        +", raca=" + raca + ", temperamento=" + temperamento
        +", vivo=" + vivo + ", fora=" + fora + '}';
    }

    



}
