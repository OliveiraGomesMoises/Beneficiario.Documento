package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BeneficiarioApplicationService implements BeneficiarioService{

    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return null;
    }
}
