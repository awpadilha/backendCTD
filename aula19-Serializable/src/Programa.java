import model.Cachorro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        // Usando o construtor padrão
        Cachorro c1 = new Cachorro();
        c1.setNome("Pluto");
        c1.setRaca("Fila");
        c1.setIdade(3);
        c1.setEndereco("Av. Bento Gonçalves, 254");

        //Usando o construtor com todos os parâmetros
        Cachorro c2 = new Cachorro(
                "Tob", "Beagle", 2, "Rua das Hortências, 52"
        );

        cachorros.add(c1);
        cachorros.add(c2);

        //Salvar a coleção cachorros em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(cachorros);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}