package map.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int telefone;


    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }


    public int getTelefone() {
        return telefone;
    }
    


    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contato)) {
            return false;
        }
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
        
}


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
