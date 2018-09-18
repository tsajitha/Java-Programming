import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
  int[] arr = {19, 1289, 199, 200, 13};
        int total = 0;
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        int average = total / arr.length;
        System.out.format("The average is:%d", average);
        }
        }
