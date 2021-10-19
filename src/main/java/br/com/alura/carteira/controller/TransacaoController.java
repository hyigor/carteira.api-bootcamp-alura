package br.com.alura.carteira.controller;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.service.TransacaoService;
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
@RequestMapping("/transacoes")
public class TransacaoController {

//    private List<Transacao> transacaos = new ArrayList<>();
//    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private TransacaoService service;

    @GetMapping
//    @ResponseBody    usando o RestController é desnecessário usar o ResponseBody
    public Page<TransacaoDto> Listar(@PageableDefault(size = 10) Pageable paginacao){
//        List<TransacaoDto> transacaesDto = new ArrayList<>();
//        for(Transacao transacao : transacaos){
//            TransacaoDto dto = new TransacaoDto();
//            dto.setTicker(transacao.getTicker());
//            dto.setPreco(transacao.getPreco());
//            dto.setQuantidade(transacao.getQuantidade());
//            dto.setTipo(transacao.getTipo());
//
//            transacaesDto.add(dto);
//
//        }

//        return transacaos.stream().map(TransacaoDto::new).collect(Collectors.toList());


//        return transacaesDto;
//
//       return transacaos
//                .stream()
//                .map(t -> modelMapper.map(t, TransacaoDto.class))
//                .collect(Collectors.toList());

        return service.Listar(paginacao);
    }

    @PostMapping
    public ResponseEntity<TransacaoDto> cadastrar(@RequestBody @Valid  TransacaoFormDto dto, UriComponentsBuilder uriComponentsBuilder){
//        Transacao transacao = new Transacao(dto.getTicker(),  dto.getData(), dto.getPreco(),dto.getQuantidade(), dto.getTipo());


//        Transacao transacao = modelMapper.map(dto, Transacao.class);
//        transacaos.add(transacao);
        TransacaoDto transacaoDto  = service.cadastrar(dto);
        URI uri = uriComponentsBuilder.path("/transacoes/{id}").buildAndExpand(transacaoDto.getId()).toUri();
        return ResponseEntity.created(uri).body(transacaoDto);
    }





}
