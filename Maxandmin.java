import java.io.*;
import java.util.*;
class Main
{
Main(int n,int a[])
{
int l=n-1,i;
int temp[] = new int[n];
int small=0,large=n-1;
boolean flag=true;
for(i =0;i<n;i++)
{
if(flag)
{
temp[i] = a[large--];
}
else
temp[i] = a[small++];
flag = !flag;
}
a = temp.clone();
for(i=0;i<n;i++)
{
System.out.print(a[i]+" " );
}
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a[] = new int [n];
for(int i=0;i<n;i++)
{
a[i] = in.nextInt();
}
Main obj = new Main(n,a.length);
}
}
