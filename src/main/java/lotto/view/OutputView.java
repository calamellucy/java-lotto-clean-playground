package lotto.view;

import lotto.domain.Lottos;

public class OutputView {

    public static void printLottos(Lottos lottos) {
        System.out.println(lottos.size() + "개를 구매했습니다.");
        for (int i = 0; i < lottos.size(); i++) {
            System.out.println(lottos.getLottoList().get(i));
        }
    }
}
