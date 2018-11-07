package pl.waw.sgh;
import java.util.regex.Pattern;
public class Homework1 {



       public static String cfibon(int NN, int o, int p){

           String fibon="";
           fibon = fibon + p + " " + o + " ";
           o = o + p;
          p = p + o;
           if (NN<=0) return fibon;
           else return cfibon(NN - 2, o, p)+fibon;

       }

//        public static boolean isValid(String email)
//        {
//            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
//                    "[a-zA-Z0-9_+&*-]+)*@" +
//                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//                    "A-Z]{2,7}$";
//
//            Pattern pat = Pattern.compile(emailRegex);
//            if (email == null)
//                return false;
//            return pat.matcher(email).matches();
//        }
//NOT MINE, BUT WORKS


    public static void main(String[] args){
        int p=0;
        int o=1;
        int n=100;
        System.out.println(cfibon(10,0,1)); ;
        String fibonacci="Ciag fibonacciego: ";
        for (int i=0;i<n;i++){
            fibonacci=fibonacci + p + " "+o+" ";

            p=p+o;
            o=p+o;
        }
        System.out.println(fibonacci);
        //##################################################
//        String email="rafa@faw.com";
//        if(isValid(email)){
//            System.out.printf("Yes");
//        }else {
//            System.out.printf("No");
//        }

        String emaill = "afa@fweawd.com";
        if(emaill.matches( ".*@.*\\.com")){
            System.out.println("Email valid");
//            else System.out.println("Email not valid");
        }
        else System.out.println("Email not valid");


    }
}
