package kr.tpc;

public class MemberVO {
    private String name;
    private int age;
    private String tel;
    private String addr;

    public MemberVO() {}
    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

    // setter, getter method
    // setter, getter method에다가 조건식을 넣어주어서 원하는 값이
    // 들어가게 만들어주는거임

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public String toString() {
        return "MemberVO [name= " + name + ", age = " + age + ", tel = " + tel + "]";
    }

}
