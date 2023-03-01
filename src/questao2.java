import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        int ano=0;
        String placa;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite a placa");
        placa = ler.next();
        System.out.println("Digite o ano");
        ano = ler.nextInt();
        if (ano<=2010)
            System.out.println("carro velho");
        else if (ano<=2021)
            System.out.println("carro semi-novo");
        else if (ano==2022)
            System.out.println("carro novo");
        else
            System.out.println("ano desconhecido");
        //for (int i=0;i<-placa.length();i++)
        //{
            //length retorna o tamanho da placa
        placa = placa.replace('a','*');
        placa = placa.replace('e','*');
        placa = placa.replace('i','*');
        placa = placa.replace('o','*');
        placa = placa.replace('u','*');
        placa = placa.replace('A','*');
        placa = placa.replace('E','*');
        placa = placa.replace('I','*');
        placa = placa.replace('O','*');
        placa = placa.replace('U','*');

        System.out.println("placa alterada:"+placa);




        }
    }





