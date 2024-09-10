package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoBeneficiarioListResponse;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRequest;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRespose;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoRespose criaDoucmento(UUID idBeneficiario ,@Valid DocumentoRequest documentoRequest);

    List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario);
}
