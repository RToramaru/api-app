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
    double quant_inical;
    @Id
    double quant_final;
    @Id
    double porcentagem;
    @Id
    String data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Double.compare(registro.quant_inical, quant_inical) == 0 && Double.compare(registro.quant_final, quant_final) == 0 && Double.compare(registro.porcentagem, porcentagem) == 0 && data.equals(registro.data) && aluno.equals(registro.aluno) && cocho.equals(registro.cocho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, cocho, quant_inical, quant_final, porcentagem, data);
    }


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

    public double getQuant_inical() {
        return quant_inical;
    }

    public void setQuant_inical(double quant_inical) {
        this.quant_inical = quant_inical;
    }

    public double getQuant_final() {
        return quant_final;
    }

    public void setQuant_final(double quant_final) {
        this.quant_final = quant_final;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
