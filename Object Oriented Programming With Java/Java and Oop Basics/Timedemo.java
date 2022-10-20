class Time{
    int hh;
    int mm;
    Time(){
        hh=0;
        mm=0;
    }
    Time(int x,int y){
        hh= x;
        mm= y;
    }
    Time add(Time y){
        Time temp = new Time();
        temp.mm = mm + y.mm ;
        temp.hh = hh + y.hh + (temp.mm/60);
        temp.mm = temp.mm%60;
        
        return temp;
    }
    
    void displaydata(){
        System.out.println("Time = "+hh+" : "+mm);
    }
}
public class Timedemo{
    public static void main(String[] args) {
        Time t1 = new Time(5,35);
        Time t2 = new Time(6,45);
        Time t3 = new Time();
        t3 = t1.add(t2);
        t1.displaydata();
        t2.displaydata();
        t3.displaydata();
    }
}
