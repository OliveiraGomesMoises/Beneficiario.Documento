package br.com.beneficiario.documento.beneficiario.documento.documento.domain;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @NotNull
    private UUID idBeneficiario;
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipo;
    @NotBlank
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        this.idBeneficiario = idBeneficiario;
        this.tipo = documentoRequest.getTipo();
        this.descricao = documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();

    }
}
