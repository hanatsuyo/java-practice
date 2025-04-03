public class ReferenceType {

    public static void main(String[] args) {
        String stringA = "村田";
        System.out.println(stringA);
        System.out.println(stringA.length());

        String stringB = null;
        if (stringB != null) {
            System.out.println(stringB);
        } else {
            System.out.println("これはnullです");
        }
    }
}