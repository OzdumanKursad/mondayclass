public class Demo {
    public static void main(String[] args) {
/**
 * input : My nickname is (Alex)
 * output: Alex
 * input : (Alex) is my nickname
 * output: Alex
 */                  //      15    20
String sent = "(Alex) nickname is ";
int indexOfSign1 = sent.indexOf('(');
int indexOfSing2 = sent.indexOf(')');
        System.out.println(indexOfSign1 +"-"+indexOfSing2);
String str = sent.substring(indexOfSign1+1,indexOfSing2);
        System.out.println(str);

    }
}
