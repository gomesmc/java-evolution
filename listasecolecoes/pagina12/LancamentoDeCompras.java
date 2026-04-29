package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina12;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LancamentoDeCompras {
        private String produtos;
        private double valores;

        public LancamentoDeCompras(String produtos, double valores){
            this.produtos=produtos;
            this.valores=valores;
        }

    public double getValores() {
        return valores;
    }

    public String getProdutos() {
        return produtos;
    }

    public String toString(){
            return getProdutos()  + " - " + getValores() + "\n";
        }

       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);

           List<LancamentoDeCompras> listaCompras = new ArrayList<>();

            System.out.print ("Digite o limite do cartão: R$ ");
            double limite = scan.nextDouble();
            scan.nextLine();

           System.out.print ("Digite a descrição do produto: ");
           String descricao = scan.nextLine();

           System.out.print("Digite o valor da compra: R$ ");
           double valor = scan.nextDouble();

           System.out.println("Compra realizada!");
           System.out.print("Digite 0 para sair ou 1 para continuar: ");
           System.out.print("\n");
           int escolha = scan.nextInt();

           if(valor >limite){
               System.out.println("Saldo insuficiente!");
           }

           listaCompras.add(new LancamentoDeCompras(descricao, valor));

           if(escolha == 0){
               System.out.println("******************************************");
               System.out.println("COMPRA REALIZADA!");
               System.out.print(listaCompras.toString());
               System.out.println("******************************************");
           }

           while (escolha ==1 && limite > valor){
               listaCompras.add(new LancamentoDeCompras(descricao, valor));
               System.out.print ("Digite o limite do cartão: R$ ");
               limite = scan.nextDouble();
               scan.nextLine();

               System.out.print ("Digite a descrição do produto: ");
               descricao = scan.nextLine();

               System.out.print("Digite o valor da compra: R$ ");
               valor = scan.nextDouble();

               System.out.println("Compra realizada!");
               System.out.print("Digite 0 para sair ou 1 para continuar: ");
               escolha = scan.nextInt();

               if(escolha == 0){
                   System.out.println("******************************************");
                   System.out.println("COMPRA REALIZADA!");
                   System.out.print(listaCompras.toString());
                   System.out.println("\n******************************************");
               }
           }
       }
}