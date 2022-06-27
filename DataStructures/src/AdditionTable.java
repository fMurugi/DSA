public class AdditionTable {
    public static void main(String[] args){
        int x,y,z;
        for(x=0;x<5;x++){
            for(y=0;y<4;y++){
                z = x+y;
                System.out.print(z+"\t");
            }
            System.out.println();
        }
    }
}
