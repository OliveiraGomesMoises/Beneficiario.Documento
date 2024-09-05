package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class BeneficiarioRequest {
    private UUID idBeneficiario;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
