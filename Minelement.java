import java.util.*;
class Minelement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,i;
System.out.println("Enter Array size=");
size= sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter Array elements=");
for( i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
int min=arr[0];
for(i=1;i<size;i++)
{
if(arr[i]<min)
min=arr[i];
}
System.out.println("Minimum element is="+min);
}}
