
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String userName, password;
    
        Scanner scanner = new Scanner(System.in);
        
        int right = 3;
        int balance = 1500;
        int select;
        
        while(right > 0){
            System.out.print("Kullanici Adiniz : ");
            userName = scanner.nextLine();
            System.out.print("Parolaniz : ");
            password = scanner.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, X bankasina hos geldiniz.");
                do {
                    System.out.println("1-para yatirma\n2-para sorgulama\n3-bakiye sorgulama\n4-cikis yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            {
                                System.out.print("Para miktari : ");
                                int price = scanner.nextInt();
                                balance += price;
                                break;
                            }
                        case 2:
                            {
                                System.out.print("Para miktari : ");
                                int price = scanner.nextInt();
                                if(price > balance){
                                    System.out.println("Bakiye yetersiz.");
                                }
                                else{
                                    balance -= price;
                                }       break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            break;
                    }
                }while(select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            }
            else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneginiz.");
                
                if(right == 0){
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz...");
                }
                else{
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
    }
}
