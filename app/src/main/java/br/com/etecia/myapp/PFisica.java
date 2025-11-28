package br.com.etecia.myapp;

public class PFisica {
    int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    Pessoa p = new Pessoa();
    public void executaPessoa(){
        p.setNome("Etecia");
        String nome = p.getNome();
    }

}
