package main.java.cti.lyambda;

public class Main {
    public static void main(String[] args) {
        Calc calc = Calc.instance.get();

        int a = calc.plus.apply(1, 1);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a, b);
        int z = calc.pow.apply(b);
        calc.println.accept(z);
        calc.println.accept(c);
    }
}
