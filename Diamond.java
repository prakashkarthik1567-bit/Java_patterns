import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =8;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=i*2-3;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=n-i+1;j++){
                 if(i==1 && j==1) continue;
                System.out.print("*");
            }
        
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=n*2-i*2-3;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i+1;j++){
                  if(i==n-1 && j==1) continue;
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
      
