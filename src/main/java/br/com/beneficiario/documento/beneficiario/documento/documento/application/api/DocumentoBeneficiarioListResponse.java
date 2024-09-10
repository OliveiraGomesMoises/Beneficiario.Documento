package br.com.beneficiario.documento.beneficiario.documento.documento.application.api;

import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.TipoDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Value
public class DocumentoBeneficiarioListResponse {
    private UUID idDocumento;
    @NotNull
    private UUID idBeneficiario;
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipo;
    @NotBlank
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBeneficiario) {
        return null;
    }
}
