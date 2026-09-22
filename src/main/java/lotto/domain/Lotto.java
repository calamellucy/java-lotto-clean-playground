package lotto.domain;

import java.util.Collections;
import java.util.List;

public class Lotto {

    private final List<Integer> lottoNumbers;


    public Lotto(List<Integer> numbers) {
        this.lottoNumbers = numbers;
    }


    public List<Integer> getLottoNumbers() {
        return Collections.unmodifiableList(lottoNumbers);
    }

    @Override
    public String toString() {
        return lottoNumbers.toString();
    }

}
