package semana3.InterfaceExemple;

public class Pairs implements Series {
    private int value;
    @Override
    public int getNext() {
        return value += 2;
    }

    @Override
    public void reset() {
        value = 0;
    }

    @Override
    public void setInit(int init) throws Exception {
        if(init % 2 == 0) value = init;
        else throw new Exception(init + " no és un número parell");
    }
}