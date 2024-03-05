public class Main {

    public static void main(String[] args){

        Singpat singleton = Singpat.getUnqInstance();
        Singpat singleton1 = Singpat.getUnqInstance();

        singleton.increment(5);
        singleton1.increment(4);
        singleton.showData();



    }



}
