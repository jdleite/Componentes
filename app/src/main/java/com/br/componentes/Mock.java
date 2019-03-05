package com.br.componentes;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static List<String> spinnerMock() {
        List<String> lst = new ArrayList<>();
        lst.add("Gramas");
        lst.add("Kg");
        lst.add("Arroba");
        lst.add("Tonelada");

        return lst;
    }
}
