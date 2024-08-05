package com.club_app.fixture.dto;

import com.club_app.fixture.annotation.CategoryConstraint;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
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

    @CategoryConstraint
    @Column(name = "CATEGORIA")
    String categoria;
}
