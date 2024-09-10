import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("""
                                                                                  ###                    \s
                 ## ###    #####    #####   #######   #####   ## ###    #####   #######   #####   ## ### \s
                 ### ###  ### ###  ### ###     ###   ### ###  ### ###      ###    ###    ### ###  ### ###\s
                 ### ###  ### ###  ### ###    ###    ### ###  ### ###   ######    ###    ### ###  ###    \s
                 ######   ### ###  ### ###   ###     ### ###  ### ###  ### ###    ###    ### ###  ###    \s
                 ###       #####    #####   #######   #####   ### ###   ### ##     ####   #####   ###    \s
                 ###                                                                                      \
                """);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя вашего пузика: ");
        String pooz = scan.nextLine();


        System.out.print("Напиши сколько употребляет литров пива твой " + pooz + " в день?: ");
        int piv = scan.nextInt();

        System.out.print("Отлично, теперь напиши сколько лет твоему " + pooz + " :");
        int age = scan.nextInt();

        int pon = piv * 5;
        int pon2 = age + 15;
        int resp = pon * pon2;
        System.out.println("Подключение к пивняку...");

        try {
            Thread.sleep(4500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Успешное подключение!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Идёт подсчет.....");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Афигеть, твой пивной пузик по имени " + pooz + " весит " + resp + " кг!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Спасибо за использования программы Poozonator!");


    }
}
