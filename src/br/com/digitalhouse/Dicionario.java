package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Dicionario implements Imprimir{
    public String chave;
    public String apelido;

    Map<String,String> dicionario = new HashMap<>();

    public void adicionarItemNoDicionario(String novaChave,String novoApelido){
        dicionario.put(novaChave,novoApelido);
        imprimir();
    }

    @Override
    public void imprimir() {
        System.out.println(dicionario);
    }
}
