package map.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equals(descricao)){
                tarefaParaRemover = t;
                break;
            }
        } if(tarefaParaRemover != null){
            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Tarefa não encontrada...");
        }
    }

    public void exibirTarefas(){
        if(!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
          } else {
            System.out.println("O conjunto está vazio!");
          }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefasSet){
            if(t.getDescricao().equals(descricao)){
                t.setConcluida(true);
            }
        } System.out.println("Tarefa não encontrada...");
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefasSet){
            if(t.getDescricao().equals(descricao)){
                t.setConcluida(false);
            }
        } System.out.println("Tarefa não encontrada...");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if(t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        } return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet){
            if(!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        } return tarefasPendentes;
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
        System.out.println("Todas as tarefas foram removidas...");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
    }

    

