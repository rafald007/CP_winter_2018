package pl.waw.sgh;

public class PlayWithText {

    public static void main(String[] args) {
        String s = "abc";
        String s1 = "def";
        String s3 = s + s1;

        System.out.println(s + s1);

        int slen = s.length();
        System.out.println(slen);
        System.out.println(s.indexOf("ab"));
        System.out.println(s.charAt(2));

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1,4));

        String s4 = "ABC";
//        String s5 = "ABC";
        String s5 = new String( "ABC");
        System.out.println(s4);
        System.out.println(s5);

        if (s4 == s5){
            System.out.println("s4 and s5 are equal");
        }else{
            System.out.println("s4 and s5 are not equal");
        }if (s4.equals(s5)){
            System.out.println("s4 and s5 are equal by content");
        }else{
            System.out.println("s4 and s5 are not equal by content");
        }
        System.out.println(s5);



    }

}
