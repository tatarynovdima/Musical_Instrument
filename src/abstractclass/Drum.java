package abstractclass;

public class Drum extends Instrument {
    @Override
    protected void playNote(String note) {
        System.out.println("Drum is playing : ");
        for (int i = 0 ; i < note.length(); i++){
            System.out.println("d : " + note.charAt(i));
        }
    }
}
