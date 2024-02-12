class ThreadA extends Thread{ 
    public void run(){ 
        for (int i = 1; i <= 5; i++) { 
            System.out.println("Thread i = "+(-1*i)); 
        } 
        System.out.println("Exiting Thread A"); 
    } 
}  
class ThreadB extends Thread{ 
    public void run(){ 
        for (int j = 1; j <= 5; j++) { 
            System.out.println("Thread j = "+(2*j)); 
        } 
        System.out.println("Exiting Thread B"); 
    } 
}  
class ThreadC extends Thread{ 
    public void run(){ 
        for (int k = 1; k <= 5; k++) { 
            System.out.println("Thread k = "+(2*(k-1))); 
        } 
        System.out.println("Exiting Thread C"); 
    }     
     
}  
class MultiThreadDemo { 
    public static void main(String[] args) { 
        ThreadA t1 = new ThreadA(); 
        ThreadB t2 = new ThreadB(); 
        ThreadC t3 = new ThreadC(); 
        t1.start(); 
        t2.start(); 
        t3.start();  
    } 
} 