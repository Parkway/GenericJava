import javax.swing.*;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;

/***********************************************************************
 * Created by Lance Douglas on 5/9/2017
 *
 * How to populate a buffer. Attempt 2 focuses on allowing the user
 * to repeatedly access, read from, and write to the buffer at any
 * given step. Fortunately, I was able to figure out how to display
 * the content across methods.
 ***********************************************************************/
public class BufferAttempt2 {
    public static void main(String[] args) {
        //Create buffer and allocate 10 char spaces
        int buffer = 10;
        CharBuffer CB = CharBuffer.allocate(buffer);

        //Ask for string.
        String str = JOptionPane.showInputDialog(null,
                "Enter a string:");
        try {
            //while the length of the string is less than the total buffer volume
            while (str.length() <= buffer) {
                //add the text to the buffer
                CB.put(str);
                //Grammatical prettiness. Just if else for different cases of space
                if (CB.remaining() == 1) {
                    str = JOptionPane.showInputDialog("One space remaining in buffer. Continue filling:");
                } else if (CB.remaining() == 0) {
                    JOptionPane.showMessageDialog(null,
                            "The buffer is now full.");
                    //set buffer index to 0
                    CB.rewind();
                    //Save buffer to string charBuff
                    String charBuff = CB.toString();
                    //call fin method and bring charbuff with it
                    fin(charBuff);
                } else {
                    str = JOptionPane.showInputDialog(CB.remaining() + " spaces remaining. Continue filling:");
                }
            }
            //Catch the exception
        } catch (BufferOverflowException BOE) {
            BOE.printStackTrace();
        }

        //set cb index to 0
        CB.rewind();
        //save cb to string charBuff
        String charBuff = CB.toString();
        //call overflow method with str and charbuff
        overflow(str, charBuff);
    }
    private static void overflow(String str, String charBuff) {
        //Get length of string that crashed buffer
        int strLen = str.length();
        //Make new buffer that long
        CharBuffer cB = CharBuffer.allocate(strLen);
        //Put that string in the buffer
        cB.put(str);
        //Set indices to 0
        cB.rewind();
        //Save cb contents to string cBstr
        String cBstr = cB.toString();
        //display buffer before crash, string that caused crash, and length of crasher
        JOptionPane.showMessageDialog(null,
                "Before overflowing, the buffer read \"" + charBuff +
                        "\"\nOverflow String: " + cBstr +
                        "\nTotal String Length: " + strLen);
        System.exit(13);
    }
    private static void fin(String charBuff) {
        //Say good job user
        JOptionPane.showMessageDialog(null,
                "Congratulations, you wrote to the buffer without overflowing it.\n" +
                "You wrote \"" + charBuff + "\", which is " + charBuff.length() + " characters.");
        System.exit(12);
    }
}
