package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.repository;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiario();
    Beneficiario buscabeneficiarioAtravesDoId(UUID idBeneficiario);

    Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);
}
