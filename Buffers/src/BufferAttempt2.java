import javax.swing.*;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;

/***********************************************************************
 * Created by Lance Douglas on 5/9/2017
 *
 * How to populate a buffer
 ***********************************************************************/
public class BufferAttempt2 {
    public static void main(String[] args) {
        int buffer = 10;
        CharBuffer CB = CharBuffer.allocate(buffer);

        String str = JOptionPane.showInputDialog(null,
                "Enter a string:");
        try {
            while (str.length() <= buffer) {
                CB.put(str);
                if (CB.remaining() == 1) {
                    str = JOptionPane.showInputDialog(CB.remaining() + " space remaining in buffer. Continue filling:");
                } else if (CB.remaining() == 0) {
                    JOptionPane.showMessageDialog(null,
                            "The buffer is now full.");
                    CB.rewind();
                    String charBuff = CB.toString();
                    fin(charBuff);
                } else {
                    str = JOptionPane.showInputDialog(CB.remaining() + " spaces remaining. Continue filling:");
                }
            }
        } catch (BufferOverflowException BOE) {
            BOE.printStackTrace();
        }

        CB.rewind();
        String charBuff = CB.toString();
        overflow(str, charBuff);
    }
    private static void overflow(String str, String charBuff) {
        JOptionPane.showMessageDialog(null,
                "Before overflowing, the buffer read \"" + charBuff +
                "\"\nOverflow String: " + str + "\nTotal String Length: " +  str.length());
        System.exit(13);
    }
    private static void fin(String charBuff) {
        JOptionPane.showMessageDialog(null,
                "Congratulations, you wrote to the buffer without overflowing it.\n" +
                "You wrote \"" + charBuff + "\", which is " + charBuff.length() + " characters.");
        System.exit(12);
    }
}
