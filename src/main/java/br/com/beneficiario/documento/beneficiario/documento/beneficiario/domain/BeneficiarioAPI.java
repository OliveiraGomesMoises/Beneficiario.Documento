package br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api.BeneficiarioResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);
}

