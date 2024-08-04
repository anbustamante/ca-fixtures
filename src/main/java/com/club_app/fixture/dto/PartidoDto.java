package com.club_app.fixture.dto;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank
    @Column(name = "LOCALIA")
    String localia;

    @NotBlank
    @Column(name = "RIVAL")
    String rival;

    @NotBlank
    @Column(name = "FECHA")
    String fecha;

    @NotBlank
    @Column(name = "CATEGORIA")
    String categoria;
}
