package day5;
import java.util.stream.Collectors;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class BasicLambdas {
    public static void main(String[] args) {
        BasicLambdas lda = new BasicLambdas();

        //date-time api
        //1.local date can be used to store your birthday in years, months, days, seconds, and nanoseconds.
        //2.LocalDate testing =LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        //3.ZoneID is an identifer for which time zone it is. While zoneoffset is the time zone difference from UTC(universal time scale)
        //4. In instant, there is a method that returns a ZonedDateTime by passing in a ZoneId. In a ZoneDatetime, call toInstant to get an instant.
        //5.
        LocalDate testing =LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(testing);
        for(int i = 1; i<= 12;i++)
        {
            int year = 2001;
            LocalDate daysInMonth = LocalDate.of(year,i,1);
            System.out.println(daysInMonth.lengthOfMonth());
        }
        int month =1;
        LocalDate x = LocalDate.of(2020,month,1);
        System.out.println(DayOfWeek.of(1));
        while(x.getMonthValue()==month)
        {
            if(x.getDayOfWeek()==DayOfWeek.of(1));
            {
                System.out.println(x);
            }
            x = x.with(TemporalAdjusters.previous(DayOfWeek.of(1)));
        }

        if(x.getDayOfMonth()==13&&x.getDayOfWeek()==DayOfWeek.of(5)){
            System.out.println("True");

        }
        

    }

    public String[] smallestToBiggest(String[] arr)
    {
        StringFunc sortBySmallest = (i) -> {
            Arrays.sort(i);
            for(String x:i)
            {
                System.out.println(x);
            }
            return i;
        };
        return sortBySmallest.implFunction(arr);
    }

    public String[] biggestToSmallest(String[] input)
    {
        StringFunc sortByBiggest = (String[] arr) -> {
            Arrays.sort(arr, Collections.reverseOrder());
            for(String x:arr)
            {
                System.out.println(x);
            }
            return arr;
        };
        return sortByBiggest.implFunction(input);
    }

    public String[] byFirstLetter(String[] input)
    {
        StringFunc sortByFirstLetter = (String[] arr) -> {
            Arrays.sort(arr, ( str1,  str2) -> str1.charAt(0)-str2.charAt(0));
            for(String x:arr)
            {
                System.out.println(x);
            }
            return arr;
        };
        return sortByFirstLetter.implFunction(input);
    }

    public String[] sortByE(String[] input)
    {
        StringFunc sortByLetterE = (String[] arr) -> {
            Comparator<String> eCompar = (str1,str2)->{
                if(str1.charAt(0)=='e'&&str2.charAt(0)=='e')
                    return 0;
                else if(str1.charAt(0)=='e'&&str2.charAt(0)!='e')
                    return -1;
                else
                    return 1;
            };
            Arrays.sort(arr,eCompar);
            for(String x:arr)
            {
                System.out.println(x);
            }
            return arr;
        };
        return sortByLetterE.implFunction(input);
    }

    public List<String> isNumOddOrEven(Integer[] arr)
    {
        List<String> temp = Arrays.asList(arr).stream().map((input)->{
            if(input%2==0)
            {
                return "e"+String.valueOf(input);
            }
            return "o"+String.valueOf(input);
        }).collect(Collectors.toList());

        System.out.print(temp.get(0));
        for(int i = 1;i<temp.size();i++)
        {
            System.out.print(","+temp.get(i));
        }

        return temp;
    }

    public List<String> fil(String[] arr)
    {
        List<String> temp = Arrays.asList(arr).stream().filter((input)->{
            if(input.charAt(0)=='a'&&input.length()==3)
            {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.print(temp.get(0));
        for(int i = 1;i<temp.size();i++)
        {
            System.out.print(","+temp.get(i));
        }

        return temp;
    }
    
}
