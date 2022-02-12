package com.leituracocho.apirest.resources;

import com.leituracocho.apirest.models.Registro;
import com.leituracocho.apirest.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class RegistroResource {
    @Autowired
    RegistroRepository registroRepository;

    @GetMapping("/registros")
    public List<Registro> listaRegistros(){
        return registroRepository.findAll();
    }
    @PostMapping("/registro")
    public  Registro salvarRegistro(@RequestBody Registro registro){
        return registroRepository.save(registro);
    }
    @DeleteMapping("/registro")
    public  void deletarRegistro(@RequestBody Registro registro){
        registroRepository.delete(registro);
    }
    @PutMapping("/registro")
    public  Registro AtualizarRegistro(@RequestBody Registro registro){
        return registroRepository.save(registro);
    }
}
