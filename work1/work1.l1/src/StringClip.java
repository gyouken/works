import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;

public class StringClip {
    private String clip;

    public StringClip(String str) {
        this.clip = str;
    }

    public String getClip() {
        return clip;
    }

    public void setClip(String clip) {
        this.clip = clip;
    }

    public boolean isNumeric() {
        for (char c : this.clip.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphabetic() {
        for (char c : this.clip.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isUpper() {
        for (char c : this.clip.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isLower() {
        for (char c : this.clip.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    public String toUpper() throws InputMismatchException {
        if (this.isAlphabetic()) {
            return this.clip.toUpperCase();
        }
        throw new InputMismatchException();
    }

    public void resortNum() throws InputMismatchException {
        if (this.isNumeric()) {
            Integer[] num = new Integer[this.clip.length()];
            for (int i = 0; i < this.clip.length(); i++) {
                num[i] = Character.getNumericValue(this.clip.charAt(i));
            }
            Arrays.sort(num, Collections.reverseOrder());
            for (int n : num) {
                System.out.print(n);
            }
            System.out.println();
            return;
        }
        throw new InputMismatchException();
    }

    public void resortAlphabet() throws InputMismatchException {
        if (this.isAlphabetic()) {
            char[] charArray = this.clip.toCharArray();
            Arrays.sort(charArray);
            System.out.println(charArray);
            return;
        }
        throw new InputMismatchException();
    }
}
