package test;

import model.Quadrado;
import model.Triangulo;
import org.junit.jupiter.api.Test;
import service.FlyweightFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2() {

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("azul");
        triangulo2.setTamanho(6);

        assertEquals(triangulo.getCor(),"vermelho");

        assertEquals(triangulo1.getTamanho(), 4);

        assertEquals(FlyweightFactory.trianguloMap.size() == 1, false);

    }


    @Test
    void getQuadradoComTamanho2() {

        Quadrado quadrado = FlyweightFactory.obterQuadrado(5);
        quadrado.setCor("verde");

        Quadrado quadrado1 = FlyweightFactory.obterQuadrado(5);
        quadrado1.setCor("azul");

        Quadrado quadrado2 = FlyweightFactory.obterQuadrado(4);
        quadrado2.setCor("vermelho");

        assertEquals(quadrado.getTamanho(), 5);

        assertEquals(FlyweightFactory.quadradoMap.size() == 2, true);


    }

}
