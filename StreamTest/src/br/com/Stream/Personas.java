package br.com.Stream;

public class Personas {

    private String email;
    private String nome;
    private Double salary;

    public Personas(String email, String nome, Double salary) {
        this.email = email;
        this.nome = nome;
        this.salary = salary;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", salary=" + salary +
                '}';
    }
}
