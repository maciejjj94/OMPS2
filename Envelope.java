
public class Envelope {

    private int attack;
    private int decay;
    private double sustain;
    private int release;

    public Envelope(){
        attack = 0;
        decay = 0;
        sustain = 0;
        release = 0;
    }
    public Envelope(int A, int D, double S, int R)
    {
        attack = A;
        decay = D;
        sustain = S;
        release = R;
    }

    public int getA()
    {return attack;}
    public int getD()
    {return decay;}
    public double getS()
    {return sustain;}
    public int getR()
    {return release;}

    public void changeA(int x) { attack = x; }
    public void changeD(int x)
    {
        decay = x;
    }
    public void changeS(double x)
    {
        sustain = x;
    }
    public void changeR(int x)
    {
        release = x;
    }



}
