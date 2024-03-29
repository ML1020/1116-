class Test1 {
    private int data;
    int result = 0;
    public void m(){
        result += 2;
        data += 2;
        System.out.println(result + " " + data);
    }
}

class ThreadExample extends Thread{
    private Test1 mv;
    public ThreadExample(Test1 mv){
        this.mv = mv;
    }
    public void run(){
        synchronized (mv){
            mv.m();
        }
    }
}

class ThreadTest1{
    public static void main(String[] args) {
        Test1 mv = new Test1();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}