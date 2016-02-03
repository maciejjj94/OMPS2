public class Generator {

    private static final int SAMPLE_RATE = 32 * 1024 ;
    private static double freq = 440;
    private static double period = (double) SAMPLE_RATE / freq;


    public byte[] createWaveBuffer(int time)
    {

        int samples = (int) ((time * SAMPLE_RATE) / 1000);
        byte[] output = new byte[samples];
        for (int i = 0; i < output.length; i++)
        {
            double angle = 2.0 * Math.PI * i / period;
            output[i] = (byte) (Math.sin(angle)*99);
        }

        return output;
    }

    public byte[] modulateBuffer(Envelope env) {

        int A = (int) ((env.getA() * SAMPLE_RATE) / 1000);
        int D = (int) ((env.getD() * SAMPLE_RATE) / 1000);
        double S = env.getS();
        int R = (int) ((env.getR() * SAMPLE_RATE) / 1000);
        byte[] output = createWaveBuffer(env.getA() + env.getD() + 500 + env.getR());
        int length = output.length;
        for (int i = 0; i < length; i++) {
            double x = 0;

            if (i >= 0 && i < A) {
                x = (i / A);
            } else if (i >= A && i < A + D) {
                x = 1.0 - ((1.0 - S) * ((1.0 + (i - A)) / (A + D)));
            } else if (i >= A + D && i < length - R) {
                x = S;
            } else if (i >= length - R && i <= length) {
                x = S - ((1.0 + (i - length + R)) / length);
            }

            output[i] = (byte) (output[i] * x);

        }

        return output;
    }


    public int GetRate()
    {
        return SAMPLE_RATE;
    }
}
