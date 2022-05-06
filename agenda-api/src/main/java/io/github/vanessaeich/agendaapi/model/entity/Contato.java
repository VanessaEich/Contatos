package io.github.vanessaeich.agendaapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Vanessa Eich
 * @created 06/05/2022
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 150, nullable = false)
    private String nome;
    @Column(length = 150, nullable = false)
    private String email;
    @Column
    private Boolean favorito;
    @Column
    @Lob
    private byte[] foto;
}
