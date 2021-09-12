package cadastro;

import java.util.Scanner;

/**
 *
 * @author Alberto tonela
 */
public class Cadastro {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        String resposta ;
        int s =0;
        do{
        System.out.println("======BEM VINDO A NOSSA  BIBLOTECA VIRTUAL ======");
        System.out.println(" DIGITE [1]PARA PORTUGUES OU [2] PARA HISTORIA ");
        String disciplina;
        int escolha = tec.nextInt();
        switch ( escolha){
            case 1:
                System.out.println(" importante  use o sinal[-] para marcar espaco ex: java- anima-apreender");
                System.out.println("digite a quantidade de livros ");
                int q = tec.nextInt();
                int portugues[]= new int[q];
                String autor[] = new String[q];
                for(int i = 0 ; i<q ; i++){
                    for(int j = 0 ; i<q ; i++){
                        System.out.println("digite o ano");
                        portugues[i]= tec.nextInt();
                        System.out.println("informe o  titulo ");
                        autor[i]= tec.next();
                    }
                }
                for( int i = 0 ; i<q ; i++){
                    if(portugues[i]>1990){
                        System.out.println(" o livro de portugues cujo o ano de publicacao e "
                                +portugues[i]+"   o titulo  e "+ autor[i]);
                    }
                }
                System.out.println("digite [s] para continuar ou [n] para sair ");
                break;
            case 2:
                System.out.println(" importante  use o sinal[-] para marcar espaco ex: java- anima-apreender");
                System.out.println(" digite a quantidade dos livros que deseija ");
                int d =  tec.nextInt();
                int historia[]= new int[d];
                String autr[] = new String [d];
                for( int p = 0 ; p<d ; p++){
                    for(int x = 0 ; p<d ; p++){
                        System.out.println(" digite o ano ");
                        historia[p]= tec.nextInt();
                        System.out.println(" informe o titulo ");
                        autr[p] = tec.next();
                    }
                }
                for(int p =  0 ; p<d ;p++){
                    if(historia[p] >1990){
                        System.out.println(" o livro de historia cujo o ano de publicao e "
                                +historia[p] +" o titulo e "+ autr[p]);
                        
                    }
                }
                System.out.println("digite [s] para continuar ou [n] para sair ");
                break;
            case 4:
            default:
                
                disciplina  = " nao cadastrada ";
                break;
        }
                               
        resposta = tec.next();
 
        } while(resposta.equals("s"));

        
    }
    
     
}
