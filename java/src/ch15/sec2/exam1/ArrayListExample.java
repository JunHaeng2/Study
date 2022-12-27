package ch15.sec2.exam1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("1", "2", "3"));
        list.add(new Board("1", "2", "3"));
        list.add(new Board("1", "2", "3"));
        list.add(new Board("1", "2", "3"));
        list.add(new Board("1", "2", "3"));

        int size = list.size();
        System.out.println(size);

        Board board = list.get(2);
        System.out.println(board.getContent() + board.getSubject() + board.getWriter());

    }
}
