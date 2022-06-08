import java.util.Arrays;
import java.util.Random;
public class TestArrays {
    public static void main(String[]args){
        int num [] = new int[10];
        Random rand = new Random();
        long time = System.currentTimeMillis();
        rand.setSeed(time);
        System.out.println(time);

        for(int i =0;i<10;i++){
            num[i]=rand.nextInt(100);
        }
        int [] old = num.clone();
        System.out.println("old and num arae equal before sorting:"+Arrays.equals(old,num));
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("sorted:"+Arrays.toString(num));
        int[]trial = new int[5];
        Arrays.fill(trial,7);
        System.out.println(Arrays.toString(trial));
    }
}
