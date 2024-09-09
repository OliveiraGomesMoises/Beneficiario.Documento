package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRequest;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRespose;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    @Override
    public DocumentoRespose criaDoucmento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService - criaDoucmento");

        log.info("[finaliza] DocumentoApplicationService - criaDoucmento");
        return null;
    }
}
