public class insertionSortTrial {
    static int [] arr ={2,3,4,1,8,5};
    public static void main(String[]args){
        insertionSortTrial first = new insertionSortTrial();
        first.go(arr);
    }
    public static void go(int [] num){
        int n = num.length;
        for(int i = 1;i<n;i++){
            int a = num[i];//store the current number in index i in the var a;
            int j = i-1; // index of the next number

            while((j>=0)&&(num[j]>a)){
//                num[j+1]=num[j--];
//                num[j+1] = a; // put the current number in the
//
                num[j+1]=num[j]; //current number moves to the left
                j--; // decrease j
                num[j+1]=a;
            }
        }
        // loop to print the sorted array
        for(int i =0;i<n;i++){
            System.out.print(num[i]+" ,");
        }
    }
}

