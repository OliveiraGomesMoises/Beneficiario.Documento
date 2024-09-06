package br.com.beneficiario.documento.beneficiario.documento.beneficiario.infra;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {
    @Override
    Optional<Beneficiario> findById(UUID idBeneficiario);
}
