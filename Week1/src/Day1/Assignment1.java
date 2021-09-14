package Day1;
/**
* Assignment1 --- Program that Prints out '*' using looping construct
*@author Kaxian Situ
*/
public class Assignment1{
    public static void main(String[] args) throws Exception {
        System.out.println("1)");
		for(int i = 1; i <=4; i++)
		{
			for(int j= 0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
        printDot(9);
		System.out.println("2)");
        printDot(10);
		for(int i = 4; i >0; i--)
		{
			for(int j= i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("3)");
		int space = 5;
		for(int i = 0; i <4; i++)
		{
			for(int j=0;j<space-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
        printDot(11);
		System.out.println("4)");
        printDot(12);
		for(int i = 3; i >=0; i--)
		{
			for(int j=0;j<space-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
    }
	/**
	 * Prints out '.' based on input
	 * @param num An integer denoting how many '.' to print
	 */
    public static void printDot(int num)
    {
        for(int i=0;i<=num;i++)
        {
            System.out.print(".");
        }
        System.out.println("");
    }
}
