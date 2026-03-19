package teste;
import java.util.Scanner;
public class ParouImparENumeroMaior {
    static void main(String[]args){
        byte x;
        int numero,save;
        String resp = "y";

        Scanner NumberOfCase = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        Scanner resposta = new Scanner(System.in);
        Scanner parouim = new Scanner(System.in);
        System.out.println("qual voce deseja?");

        while(!resp.equals("n") && !resp.equals("N")) {

            System.out.println("qual dessas opções voce deseja fazer");
            System.out.println("opção 1   verificar se o numero é par ou impar");
            System.out.println("opção 2   qual dos numeros é o maior");
            x = opcao.nextByte();
            switch (x) {
                case 1:
                    System.out.print("digite seu numero:");
                    numero = parouim.nextByte();
                        if(numero%2==0) {
                            System.out.println(numero + " é par");
                        }else{

                            System.out.println(numero+" é impar");
                        }
                break;
                case 2:
                    int receba=0;
                    System.out.println("deseja verificar quantos numeros?");
                    save = number.nextInt();
                    int [] seenumber = new int[save];
                    for (byte count = 0; count<save ;count++) {
                        System.out.println("digite o "+count+"° numero:");
                        seenumber[count] = NumberOfCase.nextInt();
                    }
                    for(byte count2 = 0;count2 < seenumber.length;count2++) {
                        if (seenumber[count2] > receba) {
                            receba = seenumber[count2];
                        }
                    }
                    System.out.println("o maior numero é "+receba);

            }
            System.out.println("deseja continuar S/N");
        resp = resposta.next();

        }
    }
}