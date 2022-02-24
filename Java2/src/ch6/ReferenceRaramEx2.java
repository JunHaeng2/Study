package ch6;

public class ReferenceRaramEx2 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 4, 1, 5, 6};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println(sumArr(arr));
    }
        static void printArr(int[] arr) {
            for(int i : arr) {
                System.out.println(i);
            }
        }

        static void sortArr(int[] arr) {
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length-1-i; j++) {
                    if(arr[j] > arr[j+1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }

        static int sumArr(int[] arr) {
            int sum = 0;

            for(int i : arr) {
                sum += i;
            }
            return sum;
        }
}

