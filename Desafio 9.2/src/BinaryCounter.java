import NovasClasses.ClassPilha; // Replace "path.to" with the actual package path of ClassPilha

public class BinaryCounter {
    private ClassPilha _pilhaConversao;

    public BinaryCounter(int valor) {
        _pilhaConversao = new ClassPilha();
        for (int i = valor; i > 0; i--) {
            _pilhaConversao.push(i);
        }
    }

    public void print() {
        while (!_pilhaConversao.isEmpty()) {
            System.out.println(converterDecimalBinario(_pilhaConversao.pop()));
        }
    }

    //Função que converte um numero decimal em uma string binaria
    private String converterDecimalBinario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            binario = decimal % 2 + binario;
            decimal /= 2;
        }
        return binario;
    }
    
}
