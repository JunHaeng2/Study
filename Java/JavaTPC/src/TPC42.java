import java.util.*;

import kr.bit.Book;
import kr.tpc.*;

public class TPC42 {
    public static void main(String[] args) {
        
        List<BookDTO> list = new ArrayList<BookDTO>(1);
        list.add(new BookDTO("자바", 12000, "안녕", 500));
        list.add(new BookDTO("파이썬", 12000, "안녕", 500));
        list.add(new BookDTO("c", 12000, "안녕", 500));

        for(int i = 0; i < list.size(); i++) {
            BookDTO vo = list.get(i);
            System.out.println(vo.title);
        }
    }
}
