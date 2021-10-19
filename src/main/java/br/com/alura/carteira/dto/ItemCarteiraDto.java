package br.com.alura.carteira.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ItemCarteiraDto {

    private String ticker;
    private Long quantidade;
    private Double percentual;

}
