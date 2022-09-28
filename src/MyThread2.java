public class MyThread2 implements Runnable {

   MyThread2(){

   }
    @Override
    public void run() {
        for(int i=0   ; i< 200 ; i++)
            System.out.print(".");
    }
}
