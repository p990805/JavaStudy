package exception.basic.checked;

public class Service {
    Client client = new Client();

    /*
    * Checked 예외는 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
    * */
    public void callCatch(){
        try{
            client.call();
        } catch(MyCheckedException e){
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상흐름");
    }

    /**
     *
     체크 예외를 밖으로 던지는 코드
     체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
