package calculator;

public class Calс2 extends Calc {

    public Calс2()
    {
        super();
    }

    public float mult()
    {
        return this.getX() * this.getY();
    }

    public float div()
    {
        float z = this.getY();
        if(z == 0){
            return 0;
        }
        return this.getX() / z;
    }
}

