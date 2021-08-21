package pessoa;

//Crie uma classe para representar uma pessoa, com os atributos de nome, data de nascimento e altura.
    //Crie um método para calcular a idade da pessoa
    //Crie também um método para imprimir todos dados de uma pessoa.

public class Pessoa {
    
    static int idade(int ano){ //CRIANDO O MÉTODO - DENTRO DOS PARENTESES: PARAMETROS
      return 2021 - ano;
    }
    
    static void dados(String v1, int v2, float v3){
        System.out.println("O nome da pessoa é: " + v1 + ". O ano de nascimento é: " + v2 + " e a altura é: " + v3);
    }

    public static void main(String[] args) {
        String nome = "Jéssica";
        int anoDeNascimento = 1990;
        float altura = 1.66F;
        
        idade(anoDeNascimento);
        
        dados(nome, anoDeNascimento, altura);
       
    }
    
}
