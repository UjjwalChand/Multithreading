class userthread extends Thread {
    public void run() {
        System.out.println("This is user defined thread");
    }
}
class threadsop {
    public static void main(String[] args) {
    System.out.println("Program Started");
    Thread obj=Thread.currentThread(); //for getting the thread object XD <3
    String objname=obj.getName(); //for fetching the name
    System.out.println("The name is = "+objname);
    obj.setName("UjjwalsThread"); //for custom set name
    System.out.println(obj.getName());
    try{
        Thread.sleep(2000); //sleeping threads for 2 sec
    }
    catch(Exception e) {
                            //for handling the exception
    }
    System.out.println(obj.getName()); //getting the id of that thread
    System.out.println("Program Ended");
    // going to start user defined thread
    
        userthread obj2=new userthread();
        obj2.start();
    }
}