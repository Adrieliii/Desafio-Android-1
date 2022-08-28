package com.example.recyclerview.dao;

import com.example.recyclerview.model.Pais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaisDAO {

    public List<Pais> lista() {
        List<Pais> pais = new ArrayList<>(Arrays.asList(
                new Pais("Mundo", "Ver mais detalhes", "mapa"),
                new Pais("USA", "Ver mais detalhes", ""),
                new Pais("India", "Ver mais detalhes", ""),
                new Pais("France", "Ver mais detalhes", ""),
                new Pais("Germany", "Ver mais detalhes", ""),
                new Pais("UK", "Ver mais detalhes", ""),
                new Pais("Italy", "Ver mais detalhes", ""),
                new Pais("Rússia", "Ver mais detalhes", ""),
                new Pais("Turkey", "Ver mais detalhes", ""),
                new Pais("Brazil", "Ver mais detalhes", "")));
        return pais;
    }
}
