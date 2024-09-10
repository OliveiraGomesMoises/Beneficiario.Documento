package br.com.beneficiario.documento.beneficiario.documento.documento.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service.BeneficiarioService;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoBeneficiarioListResponse;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRequest;
import br.com.beneficiario.documento.beneficiario.documento.documento.application.api.DocumentoRespose;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoRespose criaDoucmento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService - criaDoucmento");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
        log.info("[finaliza] DocumentoApplicationService - criaDoucmento");
        return new  DocumentoRespose(documento.getIdDocumento());
    }

    @Override
    public List<DocumentoBeneficiarioListResponse> buscaDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
        log.info("[inicia] DocumentoApplicationService - buscaDocumentosDoBeneficiarioComId");
        beneficiarioService.buscaBeneficiarioAtravesDoId(idBeneficiario);
        List<Documento> documentosDoBeneficiario = documentoRepository.buscaDocumentosDoBeneficiarioComId(idBeneficiario);
        log.info("[finaliza] DocumentoApplicationService - buscaDocumentosDoBeneficiarioComId");
        return DocumentoBeneficiarioListResponse.converte(documentosDoBeneficiario);
    }
}
