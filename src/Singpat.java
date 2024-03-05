public class Singpat {

    private static Singpat unqInstance;
    private static int data = 0;
    private Singpat(){

    }

    public static Singpat getUnqInstance() {
        if(unqInstance == null){
            unqInstance= new Singpat();
        }
        return unqInstance;

    }
    public void showData(){
        System.out.println(this.data);
    }

    public int increment(int i ){
        return this.data= this.data+i;
    }

}
