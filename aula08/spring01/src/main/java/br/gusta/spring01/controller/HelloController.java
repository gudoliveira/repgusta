package br.gusta.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> ola() {
      //  return ResponseEntity.ok("Olá mundo!") // código 200 de sucesso (requisição bem-sucedida)
        return ResponseEntity.notFound().build(); // notFound = 404
    }

    @PostMapping("/hello")
    public String olaPost() {
        return "Ola mundo via post!";
    }

    @GetMapping("/positivo/{numero}") // insiro o par de chaves para criar uma variável onde enviarei um valor
    public ResponseEntity<String> isPositive(@PathVariable int numero){ // pathvariable = estou mandando uma variável para url
        if (numero>=0) {
            return ResponseEntity.ok("É positivo");
         } else {
                return ResponseEntity.ok("É negativo");
            }
     }
}
