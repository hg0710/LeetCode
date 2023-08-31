import java.util.*;
class Solution {
    public int romanToInt(String s) {
         int sum = 0;
        
        String[] str =s.split("");
        
        for(int i =0; i<str.length ;i++){
            switch (str[i]) {  
            case "I": sum += 1;
                     break;
            case "V":  sum += 5;
                    if(i>0 && str[i-1].equals("I")){
                        sum -= 2;
                    }
                     break;
            case "X":  sum += 10;
                    if(i>0 && str[i-1].equals("I")){
                        sum -= 2;
                    }
                     break;
            case "L":  sum += 50;
                    if(i>0 && str[i-1].equals("X")){
                        sum -= 20;
                    }
                     break;
            case "C":  sum += 100;
                    if(i>0 && str[i-1].equals("X")){
                        sum -= 20;
                    }
                     break;
            case "D":  sum += 500;
                    if(i>0 && str[i-1].equals("C")){
                        sum -= 200;
                    }
                     break;
            case "M":  sum += 1000;
                    if(i>0 && str[i-1].equals("C")){
                        sum -= 200;
                    }
                     break;
        }
        }

    return sum;
    }
}