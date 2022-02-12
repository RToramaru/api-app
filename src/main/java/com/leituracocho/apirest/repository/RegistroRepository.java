package com.leituracocho.apirest.repository;

import com.leituracocho.apirest.models.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository  extends JpaRepository<Registro, Long> {

}
