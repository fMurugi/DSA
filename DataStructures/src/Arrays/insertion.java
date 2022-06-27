package Arrays;

public class insertion {
    static int [] myArr = {5,3,4,1,2};
    int n = myArr.length;
    public static void main(String[]args){
        insertion myInsertion = new insertion();
        myInsertion.go(myArr);
    }
    public void go(int []arr){
        for(int i = 0;i<n-1;i++){
            for(int j=i+1;j>=0;j--){
                if(arr[j]>arr[i]){
                    int a = arr[j];
                    int b = arr[i];
                    int c;
                    arr[i]=a;

                    arr[j]=b;

                }else{
                    break;
                }
            }
        }

        for(int i = 0;i<n-1;i++){
            System.out.print(arr[i]+",");
        }
    }
}
