import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int numero;
        double saldo,limite,rendimento;
     int opcao= Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupanca<3>Sair\n"));
     switch (opcao){
         case 1:
             numero = Integer.parseInt(JOptionPane.showInputDialog("numero da Conta:"));
             saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo:"));
             limite = Double.parseDouble(JOptionPane.showInputDialog("limite:"));
             ContaCorrente cc1 = new ContaCorrente(numero,saldo,limite);
             JOptionPane.showMessageDialog(null,"saldo"+cc1.getSaldo() +"\nSaldo com o limite:"+cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
             break;
         case 2:
             numero = Integer.parseInt(JOptionPane.showInputDialog("numero da Conta:"));
             saldo = Double.parseDouble(JOptionPane.showInputDialog("saldo:"));
             rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento:"));
             Contapoupanca cp1 = new Contapoupanca(numero,saldo,rendimento);
             cp1.atualizaRendimento();
             JOptionPane.showMessageDialog(null,"saldo"+cp1.getSaldo(),"Contapoupanca",JOptionPane.INFORMATION_MESSAGE);

             break;
         case 3:
             break;
         default:
             JOptionPane.showMessageDialog(null,"Escolha invalida","erro",JOptionPane.ERROR);
     }
    }
}
