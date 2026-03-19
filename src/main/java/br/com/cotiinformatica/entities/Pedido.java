package br.com.cotiinformatica.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Setter
@Getter
public class Pedido {

    private Integer id;
    private LocalDateTime dataHora;
    private Double valor;

    private Cliente cliente;

    private List<Produto> produtos;

}
