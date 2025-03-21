package br.com.hackathon.paciente.Hospital;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long id;

    private String nome;
    private String endereco;
    private Integer n_leitos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getN_leitos() {
        return n_leitos;
    }

    public void setN_leitos(Integer n_leitos) {
        this.n_leitos = n_leitos;
    }
}
