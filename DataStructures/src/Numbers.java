public class Numbers {
    public static void main(String[]args){
        int i =1;
        do{
            if(!(i%3 == 0)&& (!(i%5==0))){
                System.out.print(i+" ");
            }
            i++;
        }while(i<100);
    }
}
