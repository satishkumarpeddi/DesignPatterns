package SingleTonPattern;
public class singleTonPattern{
    public static void main(String[] args){
        Runtime singletonRuntime = Runtime.getRuntime();
        //Garbage Collector 
        singletonRuntime.gc();
        System.out.println(singletonRuntime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if(singletonRuntime==anotherInstance)
            System.out.println("They are the same instance");
    }
}