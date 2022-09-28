import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        MyThread mt = new MyThread(200);
//        mt.start();
//
//        for(int i = 0 ; i< 200 ; i++)
//            System.out.print("*");
//
//        Employee e = new Employee("abdul");
//        System.out.println(e);
        givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect();
        
    }
    public static void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("over");
        assertEquals("hello client", response);
    }

    private static void assertEquals(String hello_client, String response) {
        System.out.println(hello_client + response);
    }
}