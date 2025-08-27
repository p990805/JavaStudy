package exception.ex3;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex2.NetworkClientV2;

public class NetworkServiceV3_1 {
    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가
        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[오류] 코드: " + e.getAddress() + ", 메시지: " + e.getMessage() );
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: "+e.getMessage() );
        }
        finally {
            client.disconnect();
        }

    }
}
