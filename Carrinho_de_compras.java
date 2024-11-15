
package com.mycompany.carrinho_de_compras;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Carrinho_de_compras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Produto> catalogo = produtos();
        int opcao;
        int codigo = 0;
        double quantidade = 0;
        boolean rodar = true;
        while(rodar == true){
            System.out.println("Digite uma opcao");
            System.out.println("1- Ver catalogo");
            System.out.println("2- Comprar");
            System.out.println("3- Encerrar");
            opcao = entrada.nextInt();
            if(opcao == 1){
                for(Produto produto : catalogo){
                    System.out.println("Codigo: " + produto.getCodigo() + " Nome: " + produto.getNome() +  " Preco " + produto.getPreco());
                }
            }else if(opcao == 2){
                boolean comprar = true;
                int adicionar;
                    while(comprar == true){
                    System.out.println("Digite o codigo do produto");
                    codigo = entrada.nextInt();
                    System.out.println("Digite a quantidade a ser comprada ");
                    quantidade = entrada.nextInt();
                    System.out.println("Deseja continuar comprando? \n 1- Sim \n 2- Nao");
                    adicionar = entrada.nextInt();
                    comprar(codigo, quantidade);
                    System.out.println(comprar(codigo, quantidade));
                    if(adicionar == 2){
                        comprar = false;
                    }else{
                        comprar = true;
                    }
                }
            }else if(opcao == 3){
                System.out.println("O valor total da compra e " + comprar(codigo, quantidade));
                rodar = false;
            }
                 
            
        }}
    
    public static List<Produto> produtos(){
        Produto produto1 = new Produto();
        produto1.produto("2025 BMW M2 Steptronic", 1, 450000);
        Produto produto2 = new Produto();
        produto2.produto("1968 Chevrolet Impala Custom Coupe", 2, 328500);
        Produto produto3 = new Produto();
        produto3.produto("Lincon Aviator 3.0 Turbo AWD ", 3, 205700);
        List catalogo = new ArrayList<>();
        catalogo.add(produto1);
        catalogo.add(produto2);
        catalogo.add(produto3);
        return catalogo;
}
    public static double comprar(int codigo, double quantidade) {
        double preco;
        double total = 0;
        double totalp1 = 0;
        double totalp2 = 0;
        double totalp3 = 0;
        List<Produto> catalogo = produtos();
            if (codigo == 1) {
                preco = catalogo.get(0).getPreco();
                totalp1 =  preco * quantidade;
            }else if(codigo == 2){
                preco = catalogo.get(1).getPreco();
                totalp2 = preco * quantidade;
            } else if(codigo == 3){
                preco = catalogo.get(2).getPreco();
                totalp3 = preco * quantidade;
            }else{
                System.out.println("Produto invalido, tente novamente");
            }
            total = totalp1 + totalp2 + totalp3;
            return total;
        }

    }
    

