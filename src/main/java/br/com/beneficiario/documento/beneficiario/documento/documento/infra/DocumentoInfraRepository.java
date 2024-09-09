package br.com.beneficiario.documento.beneficiario.documento.documento.infra;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.service.DocumentoRepository;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2

public class DocumentoInfraRepository implements DocumentoRepository {
    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDocumento");
        log.info("[finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }
}
