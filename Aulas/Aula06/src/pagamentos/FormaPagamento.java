package pagamentos;

public interface FormaPagamento {
    void receberPagamento(String identificador, double valor);
    double reembolsar();
    String emitirComprovante();
}
