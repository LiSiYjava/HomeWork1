/**
 * Created by User on 22.10.2016.
 */
public class phone {
    public static void main(String... args) {
        long nums = 931111111;
        long o;
        o=nums/10000000;
        if((nums/100000000)>1) System.out.println("Phone number is correct");
        if(o==93) System.out.println("оператор Life");
        else if(o==73) System.out.println("оператор Life");
        else if(o==67) System.out.println("оператор KyivStar");
        else System.out.println("неизвестный оператор");
        long sum=0;
            for (; ; ) {
                sum = sum + nums % 10;
                nums /= 10;
                if (nums == 0) break;
            }
            System.out.println("1st round of calculation, sum is "+sum);
        int i=2;
        for(;sum>=10;){
            sum=sum/10+sum%10;
            System.out.println(i+"st round of calculation, sum is "+sum);
            i++;
        }
        System.out.print("Final results is: ");
        if(sum==1)  System.out.println("One");
        else if (sum==2) System.out.print("Two");
        else if (sum==3) System.out.print("Three");
        else if (sum==4) System.out.print("Four");
        else if (sum==5) System.out.print("Five");
        else if (sum==6) System.out.print("Six");
        else if (sum==7) System.out.print("Seven");
        else if (sum==8) System.out.print("Eight");
        else if (sum==9) System.out.print("Nine");
    }
}