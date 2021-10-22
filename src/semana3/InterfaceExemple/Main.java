package semana3.InterfaceExemple;

public class Main {

    public static void main(String[] args) {
        Pairs parells = new Pairs();

        try {
            parells.setInit(0);
            for(int i=0; i < 100; i++) {
                System.out.println(parells.getNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Fibonacci fib = new Fibonacci();
        fib.reset();
        for(int i=0; i<10; i++) {
            System.out.println(fib.getNext());
        }


    }
}
