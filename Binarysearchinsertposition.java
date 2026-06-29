class Binarysearchinsertposition{
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
        int k=binarysearch(a,tar);
        System.out.println(k);
        sc.close();
    }
    static int binarysearch(int a[],int t){
        int start=0;
        int end=a.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(a[mid]==t){
                return mid;
            }
            else if(a[mid]<t){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

 
    }
    return start;
}
   }
