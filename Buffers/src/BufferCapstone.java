import javax.swing.*;
import java.awt.*;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;

/***********************************************************************
 * Created by Lance Douglas on 5/5/2017 - BufferAttempt2
 *
 * By design, this program highlights the usage of buffers. Basically,
 * I created a small buffer with a limit of 10 chars, and then
 * prompt the user to enter a string. From here, if the String is
 * lengthier than the buffer limit, catch the overflow in a secondary
 * buffer, and explain the concept. If the String is less than 10,
 * simply state how much space is left in the buffer and close.
 ***********************************************************************/
public class BufferCapstone {
    //this method handles the user input for the first buffer.
    public static void main(String[] args) {

        //Setting font to a more User Friendly alternative.
        UIManager.put("OptionPane.messageFont", new Font(
                "Source Code Pro", Font.PLAIN, 14));

        //Explain program to user.
        String starter = "This program demonstrates buffers in programming. " +
                "The default buffer starts at ten characters maximum. " +
                "Begin by entering various strings, and watch what happens if " +
                "the string <strong>length</strong> is less than ten, equal to ten, or higher than ten. ";

        JOptionPane.showMessageDialog(null,
                "<html><body><p style='width: 250px;'>" + starter + "</p></body></html>",
                "Hello!", JOptionPane.PLAIN_MESSAGE);
        //Start input method
        input();
    }

    /* I made this a separate method so when
        the method is called from within itself,
        it starts with the input prompt instead of the entire program restarting.
     */
    private static void input() {
        //Create buffer with of 10.
        int buffer = 10;

        //Prompt user for input
        String str = JOptionPane.showInputDialog(null,
                "Enter a string:");
        if (str.equals("")) {
            input();
        }
        try {
            //Create charBuffer, allocate memory to the buffer variable 10
            CharBuffer charBuffer = CharBuffer.allocate(buffer);
            //Add user input to the buffer.
            charBuffer.put(str);

            /* Just some grammatical prettiness.
               If the buffer has zero remaining spaces,
               simply say it's full. If there are some spaces remaining,
               tell the user how many.
             */
            if (charBuffer.remaining() == 0) {
                JOptionPane.showMessageDialog(null,
                        "The buffer is now full.");
            } else if (charBuffer.remaining() == 1) {
                JOptionPane.showMessageDialog(null,
                        "The buffer has " + charBuffer.remaining() + " space remaining.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "The buffer has " + charBuffer.remaining() + " spaces remaining.");
            }
            System.exit(8);

            /*If the string is more than ten characters long,
                naturally we will end up with a buffer overflow.
                This catch statement catches the overflow,
                explains what happened, and then main() calls overflow(str).
             */
        } catch (BufferOverflowException BOE) {
            //Just prevents program from crashing.
        }
        overflow(str);
    }
    /*  This method handles a secondary overflow,
        in case the input is more than ten chars.
     */

    private static void overflow(String str) {
        /* Gets length of str,
           cuts ten off the length of the string to properly
           allocate length of secondary buffer
        */
        int strLen = str.length();
        int remainder = strLen - 10;
        CharBuffer charBuffer = CharBuffer.allocate(remainder);

        /*This section uses a for loop to stored to the first buffer, and adds the
            leftover characters to a new, dynamically allocated, charBuffer.
            This way, the buffer is always the proper size for the text within.
         */
        for (int indexer = 10; indexer < strLen; indexer++) {
            int range = str.charAt(indexer);
            charBuffer.put((char)range);
        }
        charBuffer.rewind();

        if (strLen==11) {
            String newChars = "The text you entered was " + strLen + " characters long, " +
                    "but the buffer is only allotted for 10 characters. " +
                    "The remaining character is: " +
                    charBuffer.toString();

            JOptionPane.showMessageDialog(null,
                    "<html><body><p style='width: 250px;'>" + newChars + "</p></body></html>"
            );
        } else {
            String newChars = "The text you entered was " + strLen + " characters long, " +
                    "but the buffer is only allotted for 10 characters. " +
                    "The remaining characters are: " +
                    charBuffer.toString();

            JOptionPane.showMessageDialog(null,
                    "<html><body><p style='width: 250px;'>" + newChars + "</p></body></html>"
            );
        }

        //Explain why dynamically allocated buffers are bad juju.
        String finalStr = "Now, I have included a dynamic [currently " + remainder + " char] buffer so overflows cannot happen. " +
                "In a real world environment, unlimited buffers are bad for a number of reasons: " +
                "Limited space, especially with networked buffers. " +
                "Predetermined static memory heaps will load faster, " +
                "because the necessary size is already written to memory, and so on.";

        JOptionPane.showMessageDialog(null,
                "<html><body><p style='width: 250px;'>" + finalStr + "</p></body></html>");

        total(str);
    }
    /*  Simply one last method to display
        the final string to the user
     */
    private static void total(String str) {
        String OGString = "The original string was: " + str;
        JOptionPane.showMessageDialog(null,
                "<html><body><p style='width: 250px;'>" + OGString + "</p></body></html>", "Original String", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Good bye.");
        //Close the program.
        System.exit(1337);
    }
}
