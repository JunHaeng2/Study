import kr.tpc.Movie;

/*
배열, 클래스 -> 데이터를 담는 바구니 / 객체 -> 이동

*/


public class TPC20 {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10, 20, 30, 40, 50};

        int[] c = new int[] {10, 20, 30, 40, 50};

        for(int i=0 ; i <b.length; i++) {
            System.out.println(b[i]);
        }

        Movie m = new Movie("비트", 120, "연기자", 12, 1.3f);
        System.out.println(m.toString());
        System.out.println(m);

        Movie[] marr = new Movie[3];
        marr[0] = new Movie("비트1", 120, "연기자", 12, 1.3f);
        marr[1] = new Movie("비트2", 120, "연기자", 12, 1.3f);
        marr[2] = new Movie("비트3", 120, "연기자", 12, 1.3f);

        System.out.println(marr[0]);
        System.out.println(marr[1]);
        System.out.println(marr[2]);

        for(int i=0; i < marr.length; i++) {
            System.out.println(marr[i]);
        }
        
    }
}
