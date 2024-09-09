package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
}
