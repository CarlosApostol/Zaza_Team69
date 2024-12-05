public class VerificarLetra {
    public static boolean verificarLetra(String palabras, char letra, StringBuilder letrasAdivinadas) {
        if (palabras.indexOf(letra) >= 0) {
            letrasAdivinadas.append(letra) ;
            return letra;
        }
        return palabras;
    }
}
