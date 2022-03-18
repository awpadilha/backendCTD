import model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();

        // Usando o construtor padrão
        Contato c1 = new Contato();
        c1.setNome("Lucio");
        c1.setEmail("lucio@mail.com");
        c1.setTelefone("123456");


        //Usando o construtor com todos os parâmetros
        Contato c2 = new Contato(
                "Julio", "julio@gmail.com", "123457"
        );

        contatos.add(c1);
        contatos.add(c2);

        //Salvar contatos em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contatos);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        //Recuperar contatos de um arquivo
        List<Contato> recuperacontatos = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperacontatos = (ArrayList) ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for(Contato c : recuperacontatos) {
            System.out.println(
                    c.getNome()
                            + " | " + c.getNome()
                            + " | " + c.getEmail()
                            + " | " + c.getTelefone()
            );
        }
    }
}