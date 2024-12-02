package palindromo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidarPalindromoController {
    /**
     *
     * @param Palabra es la palabra a validar
     * @return retorna el mensaje indicando si la palabra es un palindromo o no
     */
    @GetMapping("/Validar_Palindromos/{Palabra}")
    public String ValidarPalindromos(@PathVariable String Palabra) {
        String PalabraAlrevez = "";
        for (int i = Palabra.length(); i >= 0; i--) {
            if (i > 0) {
                PalabraAlrevez += Palabra.charAt(i - 1);
            }
        }
        if (PalabraAlrevez.equalsIgnoreCase(Palabra)) {
            return "La palabra es un palindromo";
        }
        return "La palabra no es un palindromo";
    }

    /**
     *
     * @param Palabra es la palabra a validar
     * @return un mensaje indicando si la palabar es un palindromo o no
     */
    @GetMapping("/Validar_Palindromo/{Palabra}")
    public String ValidarPalindromo(@PathVariable String Palabra) {
        boolean esPalindromo = new StringBuilder(Palabra).reverse().toString().equals(Palabra);
        if (esPalindromo) {
            return "La palabra es un palindromo";
        }
        return "La palabra no es un palindromo";
    }
}