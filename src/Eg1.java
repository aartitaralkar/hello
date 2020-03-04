

/* Program to find sum,average,minimum and maximum of N numbers using input from keyboard */

import java.io.*;
class Eg1
{
public static void main(String args[])throws IOException
{
int k,sum=0,i,count=0,max,min,n;
int arr[] = new int[10];
float avg;
System.out.println("Enter how many numbers you want to enter : ");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String str;
str=br.readLine();
k = Integer.parseInt(str);

for(i=0;i<k;i++)
{
System.out.println("Enter the number :" );
BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
str=br1.readLine();
arr[i] = Integer.parseInt(str);
}
max = arr[0];
min = arr[0];
while(count < k)
{
sum += arr[count];
if(min > arr[count])
min = arr[count];
if (max < arr[count])
max = arr[count];
count += 1;
}
avg = sum/k;
System.out.println("The sum is " +sum);
System.out.println("The average is " +avg);
System.out.println("Maximum is " +max);
System.out.println("Minimum is" +min);

}
}





