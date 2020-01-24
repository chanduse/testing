import java.util.*;
class stone
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
for(int i=0;i<N;i++)
{
int T = sc.nextInt();

int one_move = T/4;
int four_move = T%4;

int total = one_move+four_move;

if(total%2 == 0)
{
System.out.println("NO");
}
else if(total==1)
{
System.out.println("YES");
}
}
}
}
