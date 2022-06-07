package Backend;

import java.sql.Date;

public class Servico {
    // atributos
    private int id;
    private String tipo, contratante, nome_prestador;
    private Date data_agendada, data_realizada;

    public Servico(int id, String tipo, String contratante, String nome_prestador, Date data_agendada, Date data_realizada) {
        this.id = id;
        this.tipo = tipo;
        this.contratante = contratante;
        this.nome_prestador = nome_prestador;
        this.data_agendada = data_agendada;
        this.data_realizada = data_realizada;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getContratante() {return contratante;}

    public void setContratante(String contratante) {this.contratante = contratante;}

    public String getNome_prestador() {return nome_prestador;}

    public void setNome_prestador(String nome_prestador) {this.nome_prestador = nome_prestador;}

    public Date getData_agendada() {return data_agendada;}

    public void setData_agendada(Date data_agendada) {this.data_agendada = data_agendada;}

    public Date getData_realizada() {return data_realizada;}

    public void setData_realizada(Date data_realizada) {this.data_realizada = data_realizada;}

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", tipo=" + tipo
        + ", contratante=" + contratante + ", nome_prestador="
        + nome_prestador + ", data_agendada=" + data_agendada
        +", data_realizada=" + data_realizada + '}';
    }
    
    
}
