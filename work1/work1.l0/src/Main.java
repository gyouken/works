public class Main {
    public static void main(String[] args) {
        Person ming = new Person("ming", 166.6, '男', 66.6,6);
        System.out.println('{');
        System.out.println("\t\"name\":\"" + ming.getName() + "\"");
        System.out.println("\t\"gender\":\"" + ming.getGender() + "\"");
        System.out.println("\t\"facevalue\":\"" + ming.getFaceValue() + "\"");
        System.out.println("\t\"height\":\"" + ming.getHeight() + "\"");
        System.out.println("\t\"weight\":\"" + ming.getWeight() + "\"");
        System.out.println('}');
    }
}
