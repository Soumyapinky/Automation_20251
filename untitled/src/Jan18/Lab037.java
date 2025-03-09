package Jan18;

import java.util.IllformedLocaleException;

public class Lab037 {
    public static void main(String[] args) {
        // JDK > 13
        //yield means it return in future
        char code = 'B';
       int val = switch (code){
           case 'A':
              yield 65;
           case 'B':
            yield 66;
           default:
               //exceptiom handle
throw new IllformedLocaleException("unexpected value"+ code);

        } ;
        System.out.println(val);
    }
}
