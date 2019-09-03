package luiz;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    Data nascimento;
    Telefone telefone;
    Data data;

    Cliente(){
        this.nome = "Fulano";
        this.rg = "1234567";
        this.cpf = "123456789";
        this.nascimento = new Data(1, 1, 1900);
        this.telefone = new Telefone("081", "999999999");
        this.data = new Data(2, 9, 2019);
    }

    Cliente(String nome, String rg, String cpf, Data nascimento, Telefone telefone, Data data){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.data = data;
    }
}
