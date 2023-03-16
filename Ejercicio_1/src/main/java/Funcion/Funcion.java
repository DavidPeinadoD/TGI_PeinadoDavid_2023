package Funcion;

public class Funcion {


    public double Funcion1(int x, int y) {

        double resultado = 0;
        if (y == 0) {
            resultado = 1;
        } else {
            resultado = x * Funcion1(x, y - 1);
        }
        return resultado;

    }

    public double Funcion2(int x, int y) {

        double resultado = 0;
        if (y == 0) {
            return 1;
        } else {
            double funcion_a_operar = Funcion2(x, y / 2);
            if (y % 2 == 0) {
                 resultado = funcion_a_operar * funcion_a_operar;
                 return resultado;
            } else {
                resultado = x * funcion_a_operar * funcion_a_operar;
                return resultado;
            }
        }
    }
}







