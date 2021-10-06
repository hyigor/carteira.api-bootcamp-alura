package br.com.alura.carteira.service;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.modelo.Transacao;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransacaoService {

    private static List<Transacao> transacaos = new ArrayList<>();
    private static ModelMapper modelMapper = new ModelMapper();

    public List<TransacaoDto> Listar() {
        return transacaos
                .stream()
                .map(t -> modelMapper.map(t, TransacaoDto.class))
                .collect(Collectors.toList());
    }

    public void cadastrar(TransacaoFormDto dto) {
        Transacao transacao = modelMapper.map(dto, Transacao.class);
        transacaos.add(transacao);

    }
}