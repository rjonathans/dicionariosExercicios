package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        LoteriadosSonhos numerosDeHoje = new LoteriadosSonhos();
        Dicionario dicionarioAtual = new Dicionario();

        numerosDeHoje.adicionarItemNoMap(0,"Ovos");
        numerosDeHoje.adicionarItemNoMap(1,"Aguia");
        numerosDeHoje.adicionarItemNoMap(2,"Escopeta");
        numerosDeHoje.adicionarItemNoMap(3,"Cavalo");
        numerosDeHoje.adicionarItemNoMap(4,"Dentista");
        numerosDeHoje.adicionarItemNoMap(5,"Fogo");

        numerosDeHoje.imprimir();


        dicionarioAtual.adicionarItemNoDicionario("João","Juan, Fissura, Maromba");



    }
}
