package lotto;

import lotto.domain.LottoNumberGenerator;
import lotto.domain.Lottos;
import lotto.domain.PurchaseAmount;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    public void run(){
        int money = InputView.inputMoney();
        int count = new PurchaseAmount().calculateNumberOfLottos(money);
        Lottos lottos = Lottos.generate(count, new LottoNumberGenerator());
        OutputView.printLottos(lottos);
    }
}
