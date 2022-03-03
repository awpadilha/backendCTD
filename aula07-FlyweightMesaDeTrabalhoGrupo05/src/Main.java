import factory.TreeFactory;

public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        for(int i = 0; i < 500000; i++){
            System.out.println(treeFactory.getTree(200.0, 400.0, "verde", "Ornamentais"));
        }

        for(int i = 0; i < 500000; i++){
            System.out.println(treeFactory.getTree(500.0, 300.0, "vermelho", "Frutíferas"));
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
