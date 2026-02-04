//Home  »  START224D  »  STREAK  »  Submissions  »  1231572711
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int t=sc.nextInt();
            int arr[]=new int[t];
            int c=0;
            int max=0;
            for(int i=0;i<t;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    c=0;
                }
                else c++;
                max=Math.max(max,c);
            }
            System.out.println(max);
            n--;
        }
	}
}


//1231531456
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int b=sc.nextInt();
        if((n>=2*t)&&(n>=2*b)){
            System.out.println("YES");
        }
        else System.out.println("NO");
	}
}
