package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);

    List<Documento> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario);
}
