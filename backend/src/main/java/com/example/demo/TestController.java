package com.example.demo;

import io.swagger.annotations.*;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teste")
public class TestController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Pessoa> create(@RequestBody Pessoa pessoa) {

        var a = new ArrayList<Pessoa>();
        a.add(new Pessoa("Andreo", "Nay"));
        a.add(new Pessoa("Nia", "Cioatto"));
        a.add(pessoa);
        return a;
    }
}

@AllArgsConstructor
class Pessoa {
    private String nome;
    private String sobrenome;

//    public Pessoa(String nome, String sobrenome) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }
//    public Pessoa() {
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getSobrenome() {
//        return sobrenome;
//    }
//
//    public void setSobrenome(String sobrenome) {
//        this.sobrenome = sobrenome;
//    }
}
