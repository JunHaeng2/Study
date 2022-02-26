package ch6;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatnate("-", strArr));
    }

    static String concatnate(String delim, String... args){
        String result = "";

        for(String str : args) {
            result += str + delim;
        }

        return result;
    }
}
