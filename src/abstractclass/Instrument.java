package abstractclass;

public abstract class Instrument {
    protected abstract void playNote(String note);
        public void play(String melody){
        playNote(melody);
    }
}
