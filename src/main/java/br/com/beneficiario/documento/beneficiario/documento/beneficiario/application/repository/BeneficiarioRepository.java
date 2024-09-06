package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.repository;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> buscaTodosBeneficiario();
}
