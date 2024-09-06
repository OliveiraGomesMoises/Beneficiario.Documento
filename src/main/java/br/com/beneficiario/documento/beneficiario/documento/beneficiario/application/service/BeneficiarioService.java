package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioResponse;

import java.util.List;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiario();
}
