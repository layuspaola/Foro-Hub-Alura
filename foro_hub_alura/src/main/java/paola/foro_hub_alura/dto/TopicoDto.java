package paola.foro_hub_alura.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class TopicoDto {

    @NotNull
    private String titulo;

    @NotNull
    private String mensaje;

    @NotNull
    private Long autorId;

    @NotNull
    private Long cursoId;

    private LocalDateTime fechaCreacion;
    private String status;

