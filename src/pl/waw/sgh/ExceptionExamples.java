package pl.waw.sgh;

import java.io.FileNotFoundException;

public class ExceptionExamples {

    public static void main(String[] args) throws Exception{
        //throw new RuntimeException("My exception");

        try {

            System.out.println("Message 1");
            if(Math.random()<0.49)
                throw new FileNotFoundException("My exception"); //if exception is thrown, it stops the code
            System.out.println("Message 2");

        }
        catch(Exception e){
            //Ten kod dziala, bo exception object jest rodzicem dla FileNotFoundException. W catch musi byc taki sam typ jak w throw lub bardziej ogolny!!!
            System.out.println("Problem: " + e.getMessage());
        }
        System.err.println("Error");

    }
}
