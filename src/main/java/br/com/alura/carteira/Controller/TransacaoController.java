package br.com.alura.carteira.Controller;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.modelo.Transacao;
import br.com.alura.carteira.service.TransacaoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

//    private List<Transacao> transacaos = new ArrayList<>();
//    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private TransacaoService service;

    @GetMapping
//    @ResponseBody    usando o RestController é desnecessário usar o ResponseBody
    public List<TransacaoDto> Listar(){
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

        return service.Listar();
    }

    @PostMapping
    public void cadastrar(@RequestBody @Valid  TransacaoFormDto dto){
//        Transacao transacao = new Transacao(dto.getTicker(),  dto.getData(), dto.getPreco(),dto.getQuantidade(), dto.getTipo());


//        Transacao transacao = modelMapper.map(dto, Transacao.class);
//        transacaos.add(transacao);
        service.cadastrar(dto);
    }





}
