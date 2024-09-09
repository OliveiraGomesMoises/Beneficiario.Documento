package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRequest;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRespose;

import java.util.UUID;

public interface DocumentoService {
    DocumentoRespose criaDoucmento(UUID idBeneficiario, DocumentoRequest documentoRequest);
}
