package com.uPlatform.unoCode;

public class val
{
	final String[] SYMBOL = {"[" , "!" , "@" , "#" , "$" , "%" , "^" , "&" ,
			"*" , "(" , ")" , "]" , "]" , "]" , "]" , "]" , "]" };

	static boolean validateCheck(Object o)
	{

		if(null == o)
		{
			return false;
		}
		return true;
	}

	@SuppressWarnings("unused")
	static boolean ValidateIDCheck(String str)
	{
		if(str.isEmpty())
		{
			return false;
		}
		if(null == str)
		{
			return false;
		}
		for (int i = 0; i < str.length(); i++)
		{
			/*
			 * [설 명] 1. matches 를 사용하면 정규식 만들 수 있습니다 2. [^a-zA-Z0-9] - 공백도 특수 문자로 인식합니다 3.
			 * [^a-zA-Z0-9\\s] - 공백은 특수 문자로 인식하지 않습니다 4. 로직 - 특수문자 여부를 확인 합니다 특수문자가 아닌 경우 숫자 및 문자 여부를
			 * 확인합니다
			 */
			if(String.valueOf(str.charAt(i)).matches("[^a-zA-Z0-9\\s]"))
			{ // 특수문자 인 경우
				System.out.println(str.charAt(i) + " : " + "특수문자");
			}
			else
			{ // 특수문자가 아닌 경우
				if(Character.isDigit(str.charAt(i)))
				{ // 숫자인 경우
					System.out.println(str.charAt(i) + " : " + "숫자");
				}
				else
				{ // 문자인 경우
					System.out.println(str.charAt(i) + " : " + "문자");
				}
			}
		}
		return true;

	}
}
