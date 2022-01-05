package com.uPlatform.unoCode;

public class VALIDATIONTOOL
{
	public static boolean ValidateObjectCheck(Object o)
	{
		if(null == o)
		{
			return false;
		}
		return true;
	}

	public static boolean ValidateIDCheck(String str)
	{
		if(null == str)
		{
			return false;
		}
		if(str.isEmpty())
		{
			return false;
		}
		for (int i = 0; i < str.length(); i++)
		{
			if(String.valueOf(str.charAt(i)).matches("[^a-zA-Z0-9]"))
			{ // 특수문자 인 경우
				return false;
			}
		}
		return true;
	}
}
