import java.util.Scanner;
public class calculate {
    public static void main(String[] args){
        String Check = "yes";
        while(Check.equals("yes")){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 수를 입력해주세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 수를 입력해주세요 : ");
            int num2 = sc.nextInt();
            System.out.print("+, -, *, /, % 중 선택하세요 : ");
            char GiHo = sc.next().charAt(0);
            System.out.println();

            System.out.println("- 계산 결과 -");
            //계산
            switch(GiHo) {
                case '+' -> System.out.println(num1+" + "+num2+" = "+(num1+num2));
                case '-' -> System.out.println(num1+" - "+num2+" = "+(num1-num2));
                case '*' -> System.out.println(num1+" * "+num2+" = "+(num1*num2));
                case '/' -> System.out.println(num1+" / "+num2+" = "+(num1/num2));
                case '%' -> System.out.println(num1+" % "+num2+" = "+(num1%num2));
            }
            System.out.println();
            System.out.print("다시 계산하시겠습니까?(yes,no) : ");
            Check = sc.next();
            System.out.println();
        }
    }
}
