import java.util.*;
public class Jogo {
    private String nome;
    private String desenvolvedor;
    private float preco;
    private List<String>Categorias = new ArrayList<>();
    private String tamanho;
    private int anoLancamento;
    private float nota;

    public Jogo(String nome, String desenvolvedor, float preco, List<String> categorias, String tamanho,
            int anoLancamento, float nota) {
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.preco = preco;
        Categorias = categorias;
        this.tamanho = tamanho;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public List<String> getCategorias() {
        return Categorias;
    }
    public void setCategorias(List<String> categorias) {
        Categorias = categorias;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
}
