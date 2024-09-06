package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public BeneficiarioListResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeCompleto = beneficiario.getNomeCompleto();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }
}
