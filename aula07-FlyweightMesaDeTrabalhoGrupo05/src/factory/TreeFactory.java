package factory;

import model.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, Tree> treeIndex = new HashMap<>();

    public Tree getTree(double altura, double largura, String cor, String tipo){
        if(treeIndex.get(tipo) == null){
            treeIndex.put(tipo, new Tree(altura, largura, cor, tipo));
            System.out.println("Nova árvore criada.");
            return treeIndex.get(tipo);
        }

        System.out.println("Árvore reutilizada.");
        return treeIndex.get(tipo);
    }
}
