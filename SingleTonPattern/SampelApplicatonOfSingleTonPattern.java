package SingleTonPattern;

  class Calculator{
    public static class LazeHolder{
        static final Calculator INSTANCE = new Calculator();
    }
    private  Calculator(){}
    public static Calculator getInstance(){
        return LazeHolder.INSTANCE;
    }
    public int add(int a, int b){
        return a+b;
    }
}

public class SampelApplicatonOfSingleTonPattern {
    public static void main(String[] args){
        Calculator calc1 = Calculator.getInstance();
        Calculator calc2 = Calculator.getInstance();
        int result = calc1.add(10,20);
        System.out.println("Addition Result: "+result);
        System.out.println("Are calc1 and calc2 same? "+(calc1==calc2));
    }
}
