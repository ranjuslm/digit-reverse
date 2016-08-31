import java.io.*;
import java.util.*;
class p3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
String s=String.valueOf(n);
StringBuffer sb=new StringBuffer();
sb.append(s);
System.out.println(sb.reverse());
}
}