package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.service;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiario();
    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesDoId(UUID idBeneficiario);

    void buscaBeneficiarioAtravesId(UUID idBeneficiario);

    void alteraBeneficiario(UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
