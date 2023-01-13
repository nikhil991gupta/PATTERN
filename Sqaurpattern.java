import java.util.Scanner;

class Sqaurpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0; i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("x");
            }
            System.out.print("\n");
            //System.out.println("\n");
        }
    }
}