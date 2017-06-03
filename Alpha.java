import java.util.*;
import java.io.*;
public class Alpha
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.nextChar();
if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
System.out.println("it is a character");
else
System.out.println("not a character");
}
}
