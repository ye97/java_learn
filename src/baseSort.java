public class baseSort  {
    public static void basesort(int n[],int left,int right){
        if(right<left){
            return;
        }
        int base=n[left];
        int left0=left;
        int right0=right;
        while(left0<right0){
            while(n[right0]>=base && right0>left0){
                right0--;
            }
            while(n[left0]<base && left0<right0){
                left0++;
            }
            int temp=n[left0];
            n[left0]=n[right0];
            n[right0]=temp;

        }
        int temp=n[left0];
        n[left0]=n[left];
        n[left]=temp;
        basesort(n,left,left0-1);
        basesort(n,left0+1,right);
    }
    public static void main(String[] args) {
        int n[]={4,1,2,4,5,6};
        baseSort.basesort(n,0,5);
        for(int a:n)
            System.out.println(a);

    }
}
