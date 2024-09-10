package br.com.beneficiario.documento.beneficiario.documento.documento.infra;

import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository <Documento, UUID> {
    Documento findByIdBeneficiario(UUID idBeneficiario);
}
