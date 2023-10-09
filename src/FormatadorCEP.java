public class FormatadorCEP {

    public static void main(String[] args) {
    try {
        
        String cepFormatado = formatarCep("12346782");
        System.out.println(cepFormatado);

      } catch (CepInvalidoException e) {
        System.out.println("O CEP tem que ter 8 números");
        }
        
    }
  
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
        }
}


