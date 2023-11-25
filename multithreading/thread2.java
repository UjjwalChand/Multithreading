class thread2 extends Thread {
    public void run() {
        for(int i=10;i>=1;i--) {
            System.out.println("Second custom thread"); 
            System.out.println("The value of thread2 is ="+i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println("Hey this is UjjwalChand"); 
            }
        }
    }
}