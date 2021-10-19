package br.com.alura.carteira.service;

import br.com.alura.carteira.dto.UsuarioDto;
import br.com.alura.carteira.dto.UsuarioFormDto;
import br.com.alura.carteira.modelo.Usuario;
import br.com.alura.carteira.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

//    private static List<Usuario> usuarios = new ArrayList<>();
    @Autowired
    private UsuarioRepository usuarioRepository;
    private static ModelMapper modelMapper = new ModelMapper();

    public Page<UsuarioDto> listar(Pageable paginacao){
        Page<Usuario> usuarios = usuarioRepository.findAll(paginacao);

        return usuarios
                .map(t -> modelMapper.map(t, UsuarioDto.class));
    }

    @Transactional
    public UsuarioDto cadastrar(UsuarioFormDto dto){
        Usuario usuario = modelMapper.map(dto, Usuario.class);
        String senha = new Random().nextInt(999999) + "";
        usuario.setSenha(senha);
        System.out.println(usuario.getSenha());
//        usuarios.add(usuario);
        usuarioRepository.save(usuario);

        return modelMapper.map(usuario, UsuarioDto.class);

    }





}
