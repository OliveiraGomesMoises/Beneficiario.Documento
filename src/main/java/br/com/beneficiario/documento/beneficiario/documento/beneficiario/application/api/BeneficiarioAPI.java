package br.com.beneficiario.documento.beneficiario.documento.beneficiario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListResponse> getTodosBeneficiario();

    @GetMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioAtravesDoId(@PathVariable UUID idBeneficiario);

    @PatchMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraBeneficiario(@PathVariable UUID idBeneficiario, @Valid @RequestBody BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);

}

