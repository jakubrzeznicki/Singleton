package pl.lodz.uni.math.kuba.projectsingleton;

public class Singleton {
    private static Singleton mySingleton;

    private Singleton() {

    }
    public static Singleton getInstance(){
        if(mySingleton == null){
            mySingleton = new Singleton();
        }
        return mySingleton;
    }

    public void getSomeThing(){

        System.out.println("I am here....");
    }

    public static void main(String a[]){
        Singleton st = Singleton.getInstance();
        st.getSomeThing();
    }
}
