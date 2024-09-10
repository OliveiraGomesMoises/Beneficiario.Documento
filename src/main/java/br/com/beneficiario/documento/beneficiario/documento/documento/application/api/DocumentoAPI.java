package br.com.beneficiario.documento.beneficiario.documento.documento.application.api;

import br.com.beneficiario.documento.beneficiario.documento.beneficiario.domain.Beneficiario;
import br.com.beneficiario.documento.beneficiario.documento.documento.domain.Documento;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoRespose postDocumento(@PathVariable UUID idBeneficiario, @Valid @RequestBody DocumentoRequest documentoRequest);

}
