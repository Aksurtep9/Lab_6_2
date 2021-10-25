package Lab_6;

import java.util.Locale;

public class Caesar {

    public String caesarCode(String input, char offset) {
        input = input.toUpperCase();
        Character.toUpperCase(offset);
        int numOffset = (int) offset;
        String fin = "";

        for (int i = 0; i < input.length(); i++) {
            char temp = (char) (input.charAt(i) + numOffset);
            if (temp > 'Z'){
                temp = (char)(temp-26);
                fin += temp;
            } else {
                 fin+= temp;
            }
        }
        return fin;
    }
}
