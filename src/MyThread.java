public class MyThread extends Thread{
    private int count ;
    MyThread(int count){
        this.count = count;
    }

    public  void run(){
        for(int i=0   ; i< count ; i++)
            System.out.print("#");
    }
}