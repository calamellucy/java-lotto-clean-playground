package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinningStatisticsTest {

    @Test
    @DisplayName("countRank()가 등수별로 정확히 센다")
    void countRank_등수별로_정확히_센다() {
        WinningNumbers winningNumbers = new WinningNumbers(List.of(1, 2, 3, 4, 5, 6));
        Lottos lottos = new Lottos(List.of(
                new Lotto(List.of(1, 2, 3, 4, 5, 6)),      // 6개 일치 -> FIRST
                new Lotto(List.of(10, 11, 12, 13, 14, 15)) // 0개 일치 -> MISS
        ));
        WinningStatistics statistics = new WinningStatistics(lottos, winningNumbers);
        assertThat(statistics.countRank(Rank.FIRST)).isEqualTo(1);
        assertThat(statistics.countRank(Rank.MISS)).isEqualTo(1);
    }
}
