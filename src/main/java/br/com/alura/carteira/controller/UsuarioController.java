package br.com.alura.carteira.controller;

import br.com.alura.carteira.dto.UsuarioDto;
import br.com.alura.carteira.dto.UsuarioFormDto;
import br.com.alura.carteira.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @GetMapping
    public Page<UsuarioDto> Listar(@PageableDefault(size = 10) Pageable paginacao){
        return service.listar(paginacao);
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> cadastrar(@RequestBody @Valid UsuarioFormDto dto, UriComponentsBuilder uriComponentsBuilder){

        UsuarioDto usuarioDto = service.cadastrar(dto);
        URI uri = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(usuarioDto.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDto);
    }



}
