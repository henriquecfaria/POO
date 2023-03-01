import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        String frase;
        int cont=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite uma frase:");
        frase = ler.nextLine();
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)=='a' || frase.charAt(i)=='e'|| frase.charAt(i)=='i'|| frase.charAt(i)=='o'|| frase.charAt(i)=='u')
                cont++;
        }
        System.out.println("total de vogais:"+cont);
    }
}
