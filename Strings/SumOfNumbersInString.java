package com.basicprograms.Strings;
public class SumOfNumbersInString 
{
	public static void main(String[] args) 
	{
        String s = "1Am23PM124";
        int sum=0;
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i))) 
            {
                int y = i + 1;
                while(y < s.length() && Character.isDigit(s.charAt(y))) 
                {
                    y++;
                }
                String sub = s.substring(i, y);
                sum += Integer.parseInt(sub);
                i = y - 1;
            }
        }
        System.out.println(sum);
	}
}
