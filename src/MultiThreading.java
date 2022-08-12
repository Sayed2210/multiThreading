public class MultiThreading {
    public static void main(String[] args) {
        var A1=new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        var A2=new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("World");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        A1.start();
        A2.start();

    }
}
