package br.com.beneficiario.documento.beneficiario.documento.documento.application.api;

import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.TipoDocumento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class DocumentoBeneficiarioListResponse {
    private UUID idDocumento;
    private UUID idBeneficiario;
    private TipoDocumento tipo;
    private String descricao;

    public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBeneficiario) {

        return documentosDoBeneficiario.stream()
                .map(DocumentoBeneficiarioListResponse::new)
                .collect(Collectors
                .toList());
    }

    public DocumentoBeneficiarioListResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.idBeneficiario = documento.getIdBeneficiario();
        this.tipo = documento.getTipo();
        this.descricao = documento.getDescricao();
    }
}
