import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;


public class Sample
{
    private Generator gen= new Generator ();

    public void generateSound(Envelope env) throws LineUnavailableException {

        final AudioFormat af = new AudioFormat(gen.GetRate(), 8, 1, true, true);
        SourceDataLine line = AudioSystem.getSourceDataLine(af);
        line.open(af, gen.GetRate());
        line.start();
        byte[] toneBuffer;

        toneBuffer = gen.modulateBuffer(env);



        int count = line.write(toneBuffer, 0, toneBuffer.length);
        System.out.println(count);

        line.drain();
        line.close();
    }

}
