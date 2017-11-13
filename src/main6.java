public class main6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i=sc.nextInt();
        int sum=0;
        int n;
        int num;
        while(i==99999);
        {
            System.out.println("請輸入第"+i+"個數字");
            num=sc.nextInt();
            sum=sum+num;
            i++;
        }
        System.out.println(sum);

    }
}