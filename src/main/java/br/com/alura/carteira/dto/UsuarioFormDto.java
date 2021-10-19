package br.com.alura.carteira.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "senha")
public class UsuarioFormDto {

        @NotBlank
        private String nome;
        @NotBlank
        private String login;

}
