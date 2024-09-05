package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
