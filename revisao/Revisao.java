import java.util.Scanner;

public class Revisao {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("quantos aninhos você tem senpai?");
        int idade = scan.nextInt();

        if (idade>=18){
            System.out.println("Você e maior");
        }
        else{
            System.out.println("Você é menor");
        }

        scan.close();
    }
}

//int idade = scan.nextInt(); TEM QUE COLOCAR NO scan.nextVARIAVEL 


//sexto
// import java.util.Scanner;

// public class Revisao {
//     public static void main(String[] args){

//         Scanner scan = new Scanner (System.in);

//         System.out.println("quantos aninhos você tem senpai?");
//         int idade = scan.nextInt();

//         if (idade>=18){
//             System.out.println("Você e maior");
//         }
//         else{
//             System.out.println("Você é menor");
//         }

//         scan.close();
//     }
// }



// System.out. > PRA FORA  System.in. PRA DENTRO

//o CODE .this antes dos códigos faz referência à VAR anterior, ou seja, a "global"

//quinto EXPLICANDO SOBRE COMO FUNCIONA A FUNÇÃO DENTRO DO CODE
// public class Revisao {
//     static String exemplo = "a";
//     static String outro = "a";

//     static String minhaFuncao(){
//         String exemplo = "b";
//         return exemplo;
//     }
//     static String minhaFuncao2(){
//         String outro = "b";
//         return outro;
//     }
//     public static void main(String[] args){

//         System.out.println(exemplo);
//         System.out.println(minhaFuncao());
//         System.out.println(outro);
//         System.out.println(minhaFuncao2());
//         System.out.println(outro);

//     }
// }


//quarto
//== igual
        //!== diferente
        //<= menor igual
        //>= maior igual
        // PODE FAZER ASSIM QUANDO É DOIS JEITOS if (() && ())
        // int a = 1;
        // int b = 9;

        // boolean igual = a == b;
        // boolean maior = a > b; 
        // boolean menor = a < b;
        // boolean diferente = a != b;

        // System.out.println(igual);
        // System.out.println(maior);
        // System.out.println(menor);
        // System.out.println(diferente);

//terceiro
// String numero = "1";
//         int primeiroNumero = 10;
//         int segundoNumero = 9;
//         boolean ativo = true;

//         System.out.println(primeiroNumero + segundoNumero + numero + ativo);

//segundo
// String numero = "1";
// int primeiroNumero = 10;
// int segundoNumero = 9;


// System.out.println(primeiroNumero + segundoNumero + numero);



//primeiro
        // String numero = "1";
        // int primeiroNumero = 10;
        // int segundoNumero = 9;

        // int resultado = 
        // primeiroNumero + segundoNumero;


        // System.out.println(resultado);
        // System.out.println(numero+primeiroNumero);


