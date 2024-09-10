package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.*;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {

    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
        log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder().idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioListResponse> buscaTodosBeneficiario() {
        log.info("[inicia] BeneficiarioApplicationService - buscaTodosBeneficiario");
        List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodosBeneficiario();
        log.info("[finaliza] BeneficiarioApplicationService - buscaTodosBeneficiario");
        return BeneficiarioListResponse.convert(beneficiarios);
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesDoId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - buscaBeneficiarioAtravesDoId");
        Beneficiario beneficiario = beneficiarioRepository.buscabeneficiarioAtravesDoId(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - buscaBeneficiarioAtravesDoId");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public void buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - buscaBeneficiarioAtravesId ");
        beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - buscaBeneficiarioAtravesId ");
    }

    @Override
    public void alteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioApplicationService - alteraBeneficiario ");
        Beneficiario beneficiario = beneficiarioRepository.buscabeneficiarioAtravesDoId(idBeneficiario);
        beneficiario.altera(beneficiarioAlteracaoRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - alteraBeneficiario ");

    }
}
