package br.com.alura.carteira.dto;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class TransacaoDto {

    private String ticker;
    private BigDecimal preco;
    private int quantidade;
    private TipoTransacao tipo;

//    public TransacaoDto(Transacao transacao) {
//        this.ticker = transacao.getTicker();
//        this.preco = transacao.getPreco();
//        this.quantidade = transacao.getQuantidade();
//        this.tipo = transacao.getTipo();
//    }    se for usar o stream do java 8 para transformar transacao em transacaoDto mas como vamos usar o model map nao precisa

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
