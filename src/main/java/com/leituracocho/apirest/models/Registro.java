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
    String quant_inical;
    @Id
    String quant_final;
    @Id
    String porcentagem;
    @Id
    String data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return aluno.equals(registro.aluno) && cocho.equals(registro.cocho) && quant_inical.equals(registro.quant_inical) && quant_final.equals(registro.quant_final) && porcentagem.equals(registro.porcentagem) && data.equals(registro.data);
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
}
