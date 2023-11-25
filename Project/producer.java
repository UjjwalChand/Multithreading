class producer extends Thread {
    source c;
    producer(source c) {
        this.c=c;
    }
    public void run() {
        int i=1;
        while(true) {
            this.c.produce_item(i);
            try{Thread.sleep(2000);}catch(Exception e){}
            i++;
        }
    }
}