package com.leituracocho.apirest.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "registro")
@IdClass(Registro.class)
public class Registro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    String aluno;
    @Id
    String cocho;
    @Id
    String quant_inicial;
    @Id
    String quant_final;
    @Id
    String porcentagem;
    @Id
    String data;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCocho() {
        return cocho;
    }

    public void setCocho(String cocho) {
        this.cocho = cocho;
    }

    public String getQuant_inicial() {
        return quant_inicial;
    }

    public void setQuant_inicial(String quant_inicial) {
        this.quant_inicial = quant_inicial;
    }

    public String getQuant_final() {
        return quant_final;
    }

    public void setQuant_final(String quant_final) {
        this.quant_final = quant_final;
    }

    public String getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(String porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return aluno.equals(registro.aluno) && cocho.equals(registro.cocho) && quant_inicial.equals(registro.quant_inicial) && quant_final.equals(registro.quant_final) && porcentagem.equals(registro.porcentagem) && data.equals(registro.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, cocho, quant_inicial, quant_final, porcentagem, data);
    }
}
