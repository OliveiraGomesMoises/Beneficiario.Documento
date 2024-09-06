package br.com.beneficiario.documento.beneficiario.documento.documento.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@Log4j2
public class DocumentoController implements DocumentoAPI {
    @Override
    public DocumentoRespose postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        log.info("[finaliza] DocumentoController - postDocumento");
        return null;
    }
}
