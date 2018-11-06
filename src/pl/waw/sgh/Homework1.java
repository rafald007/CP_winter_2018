package pl.waw.sgh;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework1 {



        public static boolean isValid(String email)
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pat.matcher(email).matches();
        }

        /* driver function to check */


    public static void main(String[] args){
        int p=0;
        int o=1;
        int n=100;
        String fibonacci="Ciag fibonacciego: ";
        for (int i=0;i<n;i++){
            fibonacci=fibonacci + p + " "+o+" ";

            p=p+o;
            o=p+o;
        }
        System.out.println(fibonacci);
        //##################################################
        String email="rafa@faw.com";
        if(isValid(email)){
            System.out.printf("Yes");
        }else {
            System.out.printf("No");
        }


    }
}
