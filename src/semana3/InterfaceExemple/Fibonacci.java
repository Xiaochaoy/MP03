package semana3.InterfaceExemple;

public class Fibonacci implements Series{
    private int num1;
    private int num2;

    @Override
    public int getNext() {
        // 0,1,1,2,3,5,8...
        int tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp + num2;
        return num2;
    }


    @Override
    public void reset() {
        num1 = 0;
        num2 = 1;
    }

    @Override
    public void setInit(int init) throws Exception {
        //TODO codi per iniciar la sèrie verificant
    }
}
