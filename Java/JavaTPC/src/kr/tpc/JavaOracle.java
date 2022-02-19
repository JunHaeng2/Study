package kr.tpc;

public class JavaOracle implements DBconnect {
    
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("Oracel DB가 접속됩니다.");
    }
}
