import java.util.Scanner;
public class DivisibilityBy3 {
    static int findDivisibility(int[] A,int size)
    {
        int result=0,power=1;
        for(int i=size-1;i>=0;i--)
        {
            result=(result+((A[i]%3)*power))%3;
            power=(power*10)%3;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int mod=findDivisibility(A,n);
        System.out.println(mod);
    }
}
