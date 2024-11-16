public class MyProgram {
    public static void main(String[] args) {
        MyTime t = new MyTime();
        MyTime t1 = new MyTime(10, 12, 30);
        MyTime x;
        
        x = t;
        
        t.setHours(12);
        t.setMinutes(30);
        t.setSeconds(100);
        
        System.out.println(t);
        System.out.println(t1);
        
        x.setHours(6);
        System.out.println(t);
        
        System.out.println(t == t1);
        System.out.println(t.equals(t1));
//        System.out.println(t.toStringx());

         while (true) { //code that runs the tick by hour, tickbymin, etc.
            System.out.println(t);
            t.tickBySecond(); // Increment the time by one second
            
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
