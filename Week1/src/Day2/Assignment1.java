package Day2;


/**
 * Assignment 1 - Takes in arguments and sums them together\
 * @author - Kaxian Situ
 */

 public class Assignment1{
/**
 * 
 * @param args - user passed in arguments. If argument is invalid in summation, error is catch and handle as apporpriate 
 */
    public static void main(String[] args){
        if(args.length>0){
            String tLine="";
                for(String s: args)
                {
                    try{
                        tLine+= s;
                    } 
                    catch (Exception e) {
                        System.out.println("Error in adding arguments to "+ tLine);
                    }
                    tLine+= s;
                }
            System.out.println(tLine);
        }
    }
 }