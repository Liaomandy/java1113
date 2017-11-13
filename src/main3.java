public class main3 {
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int i,num;

        double sum=0;
                for(i=1;i<=10;i++)
        {
            System.out.println("請輸入第"+i+"個數字");
            num=sc.nextInt();
            sum=sum+num;


        }

         double avg= sum/10;
                System.out.println(sum);
                System.out.println(avg);
    }
}
