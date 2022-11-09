package br.com.unifil.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    @GetMapping
    public String welcomePage() {
        return "Calculadora Unifil";
    }

    @GetMapping("somar/{a}/{b}")
    public String somarValores(@PathVariable Double a, @PathVariable Double b) {
        return a + " + " + b + " é igual a " + (a + b);
    }

    @GetMapping("subtrair/{a}/{b}")
    public String subtrairValores(@PathVariable Double a, @PathVariable Double b) {
        return a + " - " + b + " é igual a " + (a - b);
    }

    @GetMapping("multiplicar/{a}/{b}")
    public String multiplicarValores(@PathVariable Double a, @PathVariable Double b) {
        return a + " x " + b + " é igual a " + (a * b);
    }

    @GetMapping("dividir/{a}/{b}")
    public String dividirValores(@PathVariable Double a, @PathVariable Double b) {
        return a + " / " + b + " é igual a " + (a / b);
    }
}
