package br.com.digitalhouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteriadosSonhos implements Imprimir {

    public Integer chave;
    public String significado;

    Map<Integer, String> loteriadosSonhos = new HashMap<>();


    public void adicionarItemNoMap(Integer novaChave, String novoSignificado) {
        loteriadosSonhos.put(novaChave, novoSignificado);

    }

    @Override
    public void imprimir() {
        for (Integer chave : loteriadosSonhos.keySet());
        String valor = loteriadosSonhos.get(chave);
        System.out.println(chave + " " + valor);
    }

    @Override
    public String toString() {
        return "LoteriadosSonhos{" +
                 loteriadosSonhos ;
    }
}
