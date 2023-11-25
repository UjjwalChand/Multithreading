class source {
    int n;
    boolean f=false;
    // false for producer and true for consumer
    synchronized public void produce_item(int n)throws Exception {
        if(f) {
            wait();   //inter thread communication
        }
        this.n=n;
        System.out.println("Produced"+this.n);
        f=true;
        notify();
    }
    synchronized public int consume_item()throws Exception {
        if(!f) {
            wait();
        }
        System.out.println("Consumed"+this.n);
        f=false;
        notify();
        return this.n;
    }
}