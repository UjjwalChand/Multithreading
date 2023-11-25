class main {
    public static void main(String[] args) {
        source s=new source();
        producer p=new producer(s);
        consumer c=new consumer(s);
        p.start();
        c.start();
    }
}