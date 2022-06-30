package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int numero1, numero2;

    void calculaNumero(int numero1, int numero2){
        System.out.println("o numero e " + (numero1 + numero2));
    }
}
