import java.util.*;
class number{

public static int fact(int n){
    if(n==1)
    return 1;
    else
    return n*(fact(n-1));
}
public static void main(String arg[])throws Exception
{
   int n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   System.out.println(fact(n));
    
}
}
