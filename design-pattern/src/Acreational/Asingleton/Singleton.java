package Acreational.Asingleton;

public class Singleton {



    private Singleton (){
        System.out.println("Singleton Olusturuldu");
    }

    //Double-Checked Locking Kullanilan
//    public static Singleton getSingleton() {
//
//        if (singleton==null){
//            synchronized (Singleton.class){
//                if (singleton==null){
//                    singleton = new Singleton();
//                }
//            }
//        }
//
//        return singleton;
//    }


    //static inner class
    private static class Holder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return Holder.singleton;
    }



}
