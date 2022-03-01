package model;

public class Calculadora {

        public double valor1, valor2;

        public double somar(){
                return (this.valor1+this.valor2);
        }

        public double subtrair(){
                return (this.valor1-this.valor2);
        }

        public String toString(){
                return "\nValor 1: "+valor1+
                        "\nValor 2: "+valor2;
        }
}
