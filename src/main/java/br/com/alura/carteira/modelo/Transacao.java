package br.com.alura.carteira.modelo;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString(exclude = {"data", "quantidade", "tipo"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticker;
    private LocalDate data;
    private BigDecimal preco;
    private Integer quantidade;
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipo;
    @ManyToOne
    private Usuario usuario;

//    public Transacao() {
//
//    }
//
//
//    public Transacao(String ticker, LocalDate data, BigDecimal preco, int quantidade, TipoTransacao tipo) {
//        this.ticker = ticker;
//        this.data = data;
//        this.preco = preco;
//        this.quantidade = quantidade;
//        this.tipo = tipo;
//    }
//
//
//
//
//    @Override
//    public String toString() {
//        return "Transacao [ticker=" + ticker + ", data=" + data + ", preco=" + preco + ", quantidade=" + quantidade
//                + "]";
//    }
//
//
//    public String getTicker() {
//        return ticker;
//    }
//
//    public void setTicker(String ticker) {
//        this.ticker = ticker;
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
