package exception.ex4;

import exception.ex3.NetworkClientV3;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV4 {
    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //추가
        try {
            client.connect();
            client.send(data);
        }
        finally {
            client.disconnect();
        }

    }
}
