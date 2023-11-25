class consumer extends Thread {
    source c;
    consumer(source c) {
        this.c=c;
    }
    public void run() {
        while(true) {
            this.c.consume_item();
            try {Thread.sleep(1000);}catch(Exception e){}
        }
    }
}