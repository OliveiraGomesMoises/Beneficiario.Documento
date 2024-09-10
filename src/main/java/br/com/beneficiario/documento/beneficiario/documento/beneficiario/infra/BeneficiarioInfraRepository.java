package br.com.beneficiario.documento.beneficiario.documento.beneficiario.infra;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import br.com.beneficiario.documento.beneficiario.documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Beneficiario> buscaTodosBeneficiario() {
        log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiario");
        List<Beneficiario> todosBeneficiario = beneficiarioSpringDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiario");
        return todosBeneficiario;
    }

    @Override
    public Beneficiario buscabeneficiarioAtravesDoId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscabeneficiarioAtravesDoId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"beneficiario não encontrado!"));
        log.info("[finaliza] BeneficiarioInfraRepository - buscabeneficiarioAtravesDoId");
        return beneficiario;
    }

    @Override
    public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        beneficiarioSpringDataJPARepository.findById(idBeneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");

        return null;
    }
}
