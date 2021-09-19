package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.lang.model.util.ElementScanner6;

public class Part2 {
    public static void main(String[] args) {
        Part2 x = new Part2();
        /* x.isPala(828);
        Integer[] temp = {12,13,14,15,16,1111,11123333,555};
        List<Integer> a= Arrays.asList(temp);
        a=x.rightMostDigit(a);
        a.forEach(i->System.out.println(i));
        String[] asd = {"a","bx","cxx","dxxa","exxxc"};
        List<String> asdd= Arrays.asList(asd);
        asdd = x.removeX(asdd);
        asdd.forEach(i->System.out.println(i)); */
        int[] testing = {2,4,4,8};
        System.out.println(x.groupSumWrapper(0, testing, 14));
    }

    public void oddOrEven(int x){
        NumberInterface testOdd = (input)-> {
            if(input%2==0){
                System.out.println("EVEN");
            }
            else
            {
                System.out.println("ODD");
            }
        };

        testOdd.funcNum(x);
    }

    public void isPrime(int x){
        NumberInterface testPrime = (input)-> {
            boolean bool = false;
            for(int i = 2 ; i < x;i++)
            {
                if(x%i==0){
                    bool=true;
                    break;
                }
            }
        if(bool)
            System.out.println("COMPOSITE");
        else
            System.out.println("Prime");
        };

        testPrime.funcNum(x);
    }
    
    public void isPala(int x){
        NumberInterface testPala = (input)-> {
            int palaTest = 0;
            int temp = input;
            while(temp>0)
            {
                palaTest= palaTest*10+temp%10;
                temp=temp/10;
            }
            if(palaTest==input)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        };

        testPala.funcNum(x);
    }

    public List<Integer> rightMostDigit(List<Integer> x)
    {
        return x.stream().map((input)->{
            while(input>10)
            {
                input=input%10;
            }
            return input;
        }).collect(Collectors.toList());
    }

    public List<Integer> times2(List<Integer> x)
    {
        return x.stream().map((input)->{
            return input*2;
        }).collect(Collectors.toList());
    }

    public List<String> removeX(List<String> x)
    { 
        StringBuilder builder = new StringBuilder();
        return x.stream().map((String input)->{
            builder.setLength(0);
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)!='x'){
                    builder.append(input.charAt(i));
                }
            }
            return builder.toString();
        }).collect(Collectors.toList());
    }

    public boolean groupSumWrapper(int x,int[] arr,int sum){
        ArrayList<Integer> temp = new ArrayList<>();
        int cur =0;
        for(int i=0;i<arr.length;i++)
        {
            if(i+1<arr.length&&arr[i+1]==arr[i])
            {
                cur+=arr[i];
            }
            else
            {
                cur+=arr[i];
                temp.add(cur);
                cur=0;
            }
        }
        return groupSumClump(x, temp, sum);
    }
    public boolean groupSumClump(int x, ArrayList<Integer> arr, int sum){
        if(x==sum)
        {
            return true;
        }
        else if(arr.size()==0 || x>sum)
        {
            return false;
        }
        else{
            int toAdd = arr.remove(arr.size()-1);
            return groupSumClump(x+toAdd, arr, sum) || groupSumClump(x, arr, sum);
        }
    }
}
