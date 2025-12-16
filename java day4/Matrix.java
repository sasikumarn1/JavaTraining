public class Matrix {
    public static void main(String[] args){
        int a[]=[15,12,30,29,10];
        int start=0,end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
System.out.println(arrays.toString(a));
    }


}