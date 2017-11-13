public class main6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i=sc.nextInt();
        int sum=0;
        int num=sc.nextInt();

        i=1;
        System.out.println("請輸入第"+i+"個數字");
        num=sc.nextInt();
        while(num !=99999);
        {
            sum=sum+num;
            i++;
            System.out.println("請輸入第"+i+"個數字");
            num=sc.nextInt();
        }
        double avg;

        System.out.println(sum);

    }
}