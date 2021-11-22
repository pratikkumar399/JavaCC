package oops2;

public class Solutions {
    public static boolean isValid(String s) {
        int length;
    
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while(length != s.length());
    
        return s.length() == 0;
    }
    
    public static void main(String[] args)
	{
		
		System.out.println(isValid("Hello"));
	}
}