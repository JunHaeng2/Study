/*
클래스 로더
1. 로딩
-> 클래스 로더가 .class 파일을 읽고, 그 내용에 따라 적절한 바이너리
데이터를 만든 후 메소드 영역에 저장
-> 로딩이 끝나면 해당 클래스 파일의 class 객체를 생성해 힙영역에 저장
2. 링크
-> .class 파일 형식이 유효한지 확인
3. 초기화
-> static 변수를 할당

 */

public class Study03 {
    public static void main(String[] args) {
        ClassLoader classLoader = Study03.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
