package transport;

public class SecurityRules {
	private SecurityRules() 
	{
    }
    public static boolean canFly(String place) {
        if (place.equals("ExamCell")) {
            return false;
     }
        return true;
    }
}

