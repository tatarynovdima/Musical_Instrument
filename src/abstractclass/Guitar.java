package abstractclass;

// method play guitar use one chord

public class Guitar extends Instrument {
    @Override
    protected void playNote(String note) {
        System.out.println("Guitar is playing : ");
      for (int i = 0 ; i < note.length(); i++){
          //lead char to int and take remainder of the division
          System.out.print( (int)note.charAt(i) % 10 + "-");
          if (note.length() == i + 1){
              System.out.println("0");
          }
      }
    }
}
