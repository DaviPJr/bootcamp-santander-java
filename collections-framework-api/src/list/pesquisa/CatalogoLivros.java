package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livroAutor = new ArrayList<>();
    if (!livrosList.isEmpty()) {
      for (Livro l : livrosList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livroAutor.add(l);
        }
      }
    } else {
      System.out.println("Não foi encontrado livros com esse autor!");
    }
    return livroAutor;
  } 

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrointervaloAno = new ArrayList<>();
    if (!livrosList.isEmpty()) {
        for (Livro m : livrosList) {
            if(m.getAnoPublicacao() >= anoInicial && m.getAnoPublicacao() <= anoFinal) {
                livrointervaloAno.add(m);
            }
        }
    }
    return livrointervaloAno;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if (!livrosList.isEmpty()) {
        for(Livro l : livrosList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
        }
    }
    
  }
    return livroPorTitulo;

  
}
public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

}
}
