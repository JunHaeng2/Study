package kr.tpc;

public class BookDTO {
    // 서로 다른 데이터가 저장되어있기 때문에 배열이 아니다!
    // 이렇게 객체를 새롭게 만들어서 사용하면 서로 다른 데이터 저장 가능.

    public String title;
    public int price;
    public String company;
    public int page;

    // 디폴트 생성자 메서드(생략)

    public BookDTO(String title, int price, String company, int page) {
        // heap 영역에 객체를 생성하는 역할을 한다
        // 기계어 코드 안에서
        // heap 영역에 기억공간을 만들어주는 역할 
        // this라는 객체도 같이 만들어진다.

        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
