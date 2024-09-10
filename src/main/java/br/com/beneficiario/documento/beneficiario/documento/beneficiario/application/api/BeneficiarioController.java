package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service.BeneficiarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioController - postBeneficiario");
        BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[finaliza] BeneficiarioController - postBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public List<BeneficiarioListResponse> getTodosBeneficiario() {
        log.info("[inicia] BeneficiarioController - getTodosBeneficiario");
        List<BeneficiarioListResponse> beneficiario = beneficiarioService.buscaTodosBeneficiario();
        log.info("[finaliza] BeneficiarioController - getTodosBeneficiario");
        return beneficiario;
    }

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiarioAtravesDoId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioController - getBeneficiarioAtravesDoId");
        log.info("[idBeneficiario]{}", idBeneficiario);
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiarioAtravesDoId(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - getBeneficiarioAtravesDoId");
        return beneficiarioDetalhado;
    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario,@Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioController - patchAlteraBeneficiario");
        log.info("[idBeneficiario]{}", idBeneficiario);
        beneficiarioService.alteraBeneficiario(idBeneficiario, beneficiarioAlteracaoRequest);
        log.info("[finaliza] BeneficiarioController - patchAlteraBeneficiario");
    }
}
