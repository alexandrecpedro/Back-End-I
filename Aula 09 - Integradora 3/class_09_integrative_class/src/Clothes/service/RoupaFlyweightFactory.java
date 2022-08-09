package Clothes.service;

import Clothes.model.Roupa;

import java.util.HashMap;

public class RoupaFlyweightFactory {
    static final HashMap<String, Roupa> listaTamanhos = new HashMap();
    static final HashMap<Boolean, Roupa> listaImportacao = new HashMap();

    public Roupa obterRoupaPorTamanho(String tamanho) {
        Roupa roupa = listaTamanhos.get(tamanho);

        if(roupa == null) {
            roupa = new Roupa(tamanho);
            listaTamanhos.put(tamanho, roupa);
        }

        return roupa;
    }

    public Roupa obterRoupaPorImportacao(boolean importada) {
        Roupa roupa = listaImportacao.get(importada);

        if(roupa == null) {
            roupa = new Roupa(importada);
            listaImportacao.put(importada, roupa);
        }

        return roupa;
    }

    public int getListaTamanhosSize() {
        return  listaTamanhos.size();
    }

    public int getListaImportacaoSize() {
        return  listaImportacao.size();
    }
}
