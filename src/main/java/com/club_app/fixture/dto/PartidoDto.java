package com.club_app.fixture.dto;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "PARTIDOS")
@Valid
public class PartidoDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @NotEmpty
    @Column(name = "LOCALIA")
    String localia;

    @NotEmpty
    @Column(name = "RIVAL")
    String rival;

    @NotEmpty
    @Column(name = "FECHA")
    String fecha;

    @NotEmpty
    @Column(name = "CATEGORIA")
    String categoria;
}
