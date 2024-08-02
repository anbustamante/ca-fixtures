package com.club_app.fixture.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "PARTIDOS")
public class PartidoDto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    Long id;

    @Column(name = "LOCALIA")
    String localia;

    @Column(name = "RIVAL")
    String rival;

    @Column(name = "FECHA")
    Date fecha;

    @Column(name = "CATEGORIA")
    String categoria;
}
