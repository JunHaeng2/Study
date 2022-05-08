package level1;

public class 시저암호 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (Character.isUpperCase(arr[i])) {
                    arr[i] += n;
                    if (arr[i] > 'Z') {
                        arr[i] = (char)('A' + (arr[i] - 'Z' - 1));
                    }
                } else {
                    arr[i] += n;
                    if (arr[i] > 'z') {
                        arr[i] = (char)('a' + (arr[i] - 'z' - 1));
                    }
                }
            }
        }

        return String.valueOf(arr);
    }
}
