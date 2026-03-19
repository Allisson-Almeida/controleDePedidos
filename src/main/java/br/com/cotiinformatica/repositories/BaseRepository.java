package br.com.cotiinformatica.repositories;

public abstract class BaseRepository <T> {

    /*
       Método abstrato
     */
    public abstract void criar(T obj) throws Exception;

}
