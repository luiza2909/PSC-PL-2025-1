public class Main {

            // classe pessoa é para definir somente atributos da  pessoa e o que foi pedido

    public static void main(String[] args) {
        //Orientação a objeto de baseia no objeto, até criar um conjunto e reaproveitar esse conjunto. Se quiser criar uma nova pessoa, eu vou estar instanciando a classe pessoa
        Pessoa p1 = new Pessoa(); // O objeto vai ser criado a partir da classe pessoa. Isso é uma instancia da classe pessoa.
        p1.nome = " Luiza ";
        p1.idade = 30;
        p1.apresentar(); //Porque o metodo apresentar foi definido para apresentar as informações
    

       // Só executar a classe pessoa main, ele olha para a classe pessoa vê os atributos e executa eles.
       // A classe pessoa só realiza o que foi pedido
        
       ContaBancaria cb = new ContaBancaria();
         cb. setSaldo(15);
         
         System.err.println(cb.getSaldo());

       Calculada calc = new Calculadora();
       calc.somar (5, 17);
       int res = calc.multiplicar(5, 6);





    }
    
}
