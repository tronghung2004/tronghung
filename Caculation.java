public class Caculation {

    public Caculation(int a=5; int b=7); {

        this.a = a;
        this.b = b;
    }
    public int sum(){
        return a + b;
    }
    public int minus(){
        return a -b;
    };
    public static void main(String[] args){
        Calculation cal = new Caculation(5, 7);
        System.out.println(cal.sum());
    }
}
