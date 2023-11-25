class thread1 implements Runnable {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("First custom Thread");
            System.out.println("The value of thread1 is ="+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println("Hey this is UjjwalChand");
            }
        }
    }
    public static void main(String[] args) {
        thread1 t1=new thread1();
        Thread t2=new Thread(t1);
        t2.start();
        thread2 t3=new thread2();
        t3.start();

    }
}