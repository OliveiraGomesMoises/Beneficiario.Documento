package br.com.beneficiario.documento.beneficiario.documento.documento.application.api;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoRespose postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        log.info("[idBenficiario] {}", idBeneficiario);
        DocumentoRespose documento = documentoService.criaDoucmento(idBeneficiario, documentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }

    @Override
    public List<DocumentoBeneficiarioListResponse> getTodosDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
        log.info("[inicia] DocumentoController - getTodosDocumentosDoBeneficiarioComId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        List<DocumentoBeneficiarioListResponse> documentosDoBeneficiario = documentoService.buscaDocumentosDoBeneficiarioComId(idBeneficiario);
        log.info("[finaliza] DocumentoController - getTodosDocumentosDoBeneficiarioComId");
        return documentosDoBeneficiario;
    }
}
