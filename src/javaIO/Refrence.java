package javaIO;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public class Refrence {
    public Refrence(){
        List arr = new ArrayList();
        arr.add("a");
        arr.add("b");
        arr.forEach(System.out::println);
    }
    public void encode(){
        String code = Base64.getEncoder().encodeToString("12".getBytes());
        System.out.println("the code is "+code);

        byte[] byt = Base64.getDecoder().decode(code);
        System.out.println(byt);
    }

    public Integer sumnumber(Optional < Integer > a , Optional<Integer> b){
        System.out.println("a is "+a.isPresent());
        System.out.println("b is "+b.isPresent());

        Integer val1 = a.orElse(5);

        Integer val2 = b.get();
        return val1+val2;
    }
}
