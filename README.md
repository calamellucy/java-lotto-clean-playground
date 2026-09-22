# 로또 미션

## 폴더 구조

```
src/main/java/lotto
├── Application.java              # JVM 실행 진입점(main 메서드), LottoController 실행만 함
├── LottoController.java          # 입력→계산→생성→출력 흐름 조립
│
├── domain
│   ├── Lotto.java                 # 번호 6개를 담는 로또 한 장 (값객체)
│   ├── Lottos.java                # 구매한 로또 여러 장을 관리, generate()로 개수만큼 한 번에 생성
│   ├── LottoNumberGenerator.java  # 1~45 중 중복 없는 6개 번호 생성
│   └── PurchaseAmount.java        # 구입 금액을 구매 가능 개수로 변환 (1000원 미만이면 예외)
│
└── view
    ├── InputView.java             # 구입 금액 입력받기
    └── OutputView.java            # 구매 개수, 로또 번호 목록 출력

src/test/java/lotto/domain
├── PurchaseAmountTest.java
├── LottoNumberGeneratorTest.java
└── LottosTest.java
```
