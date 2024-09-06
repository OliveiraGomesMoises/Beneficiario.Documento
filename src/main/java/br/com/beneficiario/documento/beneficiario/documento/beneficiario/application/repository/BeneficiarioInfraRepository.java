package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.repository;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.infra.BeneficiarioSpringDataJPARepository;
import br.com.beneficiario.documento.beneficiario.documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        try {
            beneficiarioSpringDataJPARepository.save(beneficiario);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existe dados duolicados!", e);
        }
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }
}
