import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
        String testSample = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String strClips[] = testSample.split(",");
        StringClip clips[] = new StringClip[Array.getLength(strClips)];
        for (int i = 0; i < Array.getLength(strClips); i++) {
            clips[i] = new StringClip(strClips[i]);
        }
        for (StringClip clip : clips) {
            System.out.println(clip.getClip() + ":");
            if (clip.isNumeric()) {
                System.out.println("This String only contains numbers.");
            } else if (clip.isUpper()) {
                System.out.println("This String only contains uppercase.");
            } else if (clip.isLower()) {
                System.out.println("This String only contains lowercase.");
            } else if (!clip.isAlphabetic()){
                System.out.println("This String does not contains Alphabet or numbers only.");
            }
            if (clip.isNumeric()) {
                System.out.print("Resort in reverse order: ");
                clip.resortNum();
            } else if (clip.isAlphabetic()) {
                System.out.println("Convert to uppercase: " + clip.toUpper());
                System.out.print("Resort in alphabetical order: ");
                clip.resortAlphabet();
            }
            System.out.println();
        }
    }
}