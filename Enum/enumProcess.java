import java.util.Scanner;

enum Gun{
    PAZARTESI,
    SALI,
    ÇARŞAMBA,
    PERŞEMBE,
    CUMA,
    CUMARTESİ,
    PAZAR;
}

public class enumProcess{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("gün: ");
        String G = input.nextLine();
        
        switch(Gun.valueOf(G)){
            case PAZARTESI:
            case SALI:
            case ÇARŞAMBA:
            case PERŞEMBE:
            case CUMA:
                System.out.println("Hafta içi");
                break;
            case CUMARTESİ:
            case PAZAR:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Hata");
        }
        
        
    }
}
