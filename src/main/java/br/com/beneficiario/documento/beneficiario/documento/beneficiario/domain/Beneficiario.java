package br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idBeneficiario", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {

            this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
            this.telefone = beneficiarioRequest.getTelefone();
            this.dataNascimento = beneficiarioRequest.getDataNascimento();

            this.dataInclusao = LocalDateTime.now();
            this.dataAtualizacao = LocalDateTime.now();
        }



    public void altera(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequestRequest) {
        this.nomeCompleto = beneficiarioAlteracaoRequestRequest.getNomeCompleto();
        this.telefone = beneficiarioAlteracaoRequestRequest.getTelefone();
        this.dataNascimento = beneficiarioAlteracaoRequestRequest.getDataNascimento();
        this.dataAtualizacao = LocalDateTime.now();
    }
}




