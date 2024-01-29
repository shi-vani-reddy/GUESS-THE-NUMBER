import java.util.Random;
import java.util.Scanner;
class Randomnumber{
public static void main(String args[]){
Random rand = new Random();
int rand_int = rand.nextInt(100);
for(int n=1;n<=10;n++)
{
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();
if(rand_int == i)
{
System.out.println("You guessed it right!");
break;
}
else if(i<rand_int)
{
System.out.println("too low");
}
else
{
System.out.println("too high");
}
if(n==10 && rand_int!=i)
{
System.out.println("You haven't guessed it!");
}
}
}
}