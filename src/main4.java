public class main4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i,num;
        double sum=0;

        i=1;
        while(i<=10)
        {
            System.out.println("請輸入第"+i+"個數字");
            num=sc.nextInt();
            sum=sum+num;
            i++;
        }
        double avg;
        avg = sum/10;
        System.out.println(sum);
        System.out.println(avg);
    }
}
