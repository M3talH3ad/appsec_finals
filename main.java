 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for (int a = 0x41; a < 0x80; a++)
		for (int b = 0x41; b < 0x80; b++)
		for (int c = 0x41; c < 0x80; c++)
		for (int d = 0x41; d < 0x80; d++)
		for (int e = 0x41; e < 0x80; e++)
		if (a*b*c*d*e == 0xD404F501) {
			if(a+b+c+d+e == 0x229){
				String res = "" + (char)a + (char)b + (char)c + (char)d + (char)e;
				System.out.println(res);
			}
		}
		return;
	}
}


