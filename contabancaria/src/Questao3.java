import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        String frase;
        int cont=0;
        Scanner ler = new Scanner(System.in); //padrão
        System.out.println("Digite uma Frase: ");
        frase = ler.nextLine();
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e'|| frase.charAt(i)=='i'|| frase.charAt(i)=='o'|| frase.charAt(i)=='u'|| frase.charAt(i)=='A'|| frase.charAt(i)=='E'|| frase.charAt(i)=='O'|| frase.charAt(i)=='I'|| frase.charAt(i)=='U')
                cont++;
        }
        System.out.println("Total de vogais: "+ cont);
    }
}
