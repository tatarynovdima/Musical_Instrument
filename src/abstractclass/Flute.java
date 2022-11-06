package abstractclass;

public class Flute extends Instrument {
    @Override
    protected void playNote(String note) {
        System.out.println("Flute is playing : ");
       for (int i = 0 ; i < note.length(); i++){
           System.out.println("toot : " + (int)note.charAt(i) % 10);
       }
    }
}
