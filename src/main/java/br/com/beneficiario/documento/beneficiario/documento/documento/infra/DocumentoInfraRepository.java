package br.com.beneficiario.documento.beneficiario.documento.documento.infra;

import br.com.beneficiario.documento.beneficiario.documento.documento.application.service.DocumentoRepository;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDocumento");
        documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }

    @Override
    public List<Documento> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentosDoBeneficiarioComId");
//        Documento documento = documentoSpringDataJPARepository.findByIdBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentosDoBeneficiarioComId");
        return  null;
    }
}
