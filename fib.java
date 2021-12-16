import java.util.*;
class fib
{
public static void fibseq(int range)
{
int f1=1,f2=1,f3;
System.out.print(f1+" "+f2+"  ");
for(int i=3;i<=range;i++)
{
f3=f1+f2;
System.out.print(f3+"  ");
f1=f2;
f2=f3;
}
}
public static void main(String args[])
{
int range;
System.out.println("enter range");
Scanner sc=new Scanner(System.in);
range=sc.nextInt();
fibseq(range);
}

}
