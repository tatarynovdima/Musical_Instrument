package abstractclass;
/*
 * conformity key piano for keyboard
 * 1234567890QWERTYUIOPASDFGHJKLZXCVBNM
 * Q W E R T Y U I O P
 * A S D F G H J K L
 * Z X C V B N M
 * */

import static java.lang.Character.toUpperCase;

public class Piano extends Instrument{
    @Override
    protected void playNote(String note) {
        System.out.println("Piano is playing : ");
      for (int i = 0 ; i < note.length(); i++){
          System.out.println("Note : " + toUpperCase(note.charAt(i)));
      }
    }
}
