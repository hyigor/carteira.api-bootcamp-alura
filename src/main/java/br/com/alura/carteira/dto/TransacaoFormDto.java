package br.com.alura.carteira.dto;

import br.com.alura.carteira.modelo.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class TransacaoFormDto {

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 6)
    @Pattern(regexp = "[a-zA-Z]{4}[0-9][0-9]?")
    private String ticker;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal preco;
    @PastOrPresent
    private LocalDate data;
    @NotNull
    private int quantidade;
    @NotNull
    private TipoTransacao tipo;
    @NotNull
    @JsonAlias("usuario_id")
    private Long usuarioId;

//    public TransacaoFormDto() {
//
//    }
//
//    public LocalDate getData() {
//        return data;
//    }
//
//    public void setData(LocalDate data) {
//        this.data = data;
//    }
//
//    public String getTicker() {
//        return ticker;
//    }
//
//    public void setTicker(String ticker) {
//        this.ticker = ticker;
//    }
//
//    public BigDecimal getPreco() {
//        return preco;
//    }
//
//    public void setPreco(BigDecimal preco) {
//        this.preco = preco;
//    }
//
//    public int getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
//    }
//
//    public TipoTransacao getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(TipoTransacao tipo) {
//        this.tipo = tipo;
//    }
}
