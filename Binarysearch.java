import java.util.*;
class Binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int tar=sc.nextInt();
                int start=0;
        int end=n-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(a[mid]==tar){
                System.out.println("target found ");
                break;
            }
            else if(a[mid]<tar){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
