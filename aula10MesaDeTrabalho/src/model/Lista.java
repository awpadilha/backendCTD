package model;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;


public class Lista {

    private static final Logger logger = Logger.getLogger(Lista.class);
    private List<Integer> inteiros = new ArrayList<>();

    public Lista(List<Integer> inteiros) throws Exception {
        this.inteiros = inteiros;
        comparaLista(inteiros);
    }

    private void comparaLista(List<Integer> inteiros) throws Exception {

    }

}
