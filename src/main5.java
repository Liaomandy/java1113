public class main5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i=sc.nextInt();
        int sum = 0;

        while (sum <= 500)
        {
            sum = sum + i;

            i++;

        }
        System.out.println(sum);
        System.out.println(i-1);
    }
}
