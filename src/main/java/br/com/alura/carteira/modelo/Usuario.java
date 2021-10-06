package br.com.alura.carteira.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "senha")
public class Usuario {

    private String nome;
    private String login;
    private String senha;






}
