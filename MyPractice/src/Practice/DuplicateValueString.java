package Practice;

public class DuplicateValueString {

    public static void main(String[] args) {

        String s = "Welcome to india";
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) { 
            for (int j = i + 1; j < c.length; j++) {
                if (c[i]==c[j]) { 
                    System.out.println(c[i]);
                    //break;
                }
            }
        }
    }

}
