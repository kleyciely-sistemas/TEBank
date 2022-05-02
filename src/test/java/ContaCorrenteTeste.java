import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {
    @Test
    public void TemQueAdicionarSaldoEmContaCorrenteDepoisVerificarOValorFinal(){
        ContaCorrente conta1 = new ContaCorrente(2000);
        conta1.depositar(500);
        double resultado = conta1.getSaldo();
        Assertions.assertEquals(2500,resultado);
    }
    @Test
    public void TemQueRealizarSaqueEVerificarOValorFinal(){
        ContaCorrente conta2 = new ContaCorrente(1500);
        conta2.sacar(500);
        double resultado = conta2.getSaldo();
        Assertions.assertEquals(1000,resultado);
    }
    @Test
    public void TemQueRealizarUmSaqueComSaldoZeroEPermanecerIgualAZero(){
        ContaCorrente conta3 = new ContaCorrente(0);
        conta3.sacar(600);
        double resultado = conta3.getSaldo();
        Assertions.assertEquals(0,resultado);
    }
}
