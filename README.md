# 사다리 게임

## 진행 방법

* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

## 사다리 생성 방법
- LadderLine: 참가자 수를 기반으로 조합하여 LadderLine을 생성한다.
- 홀수번째(Bar -> '|')는 true, 짝수번째(Blank/Ladder -> '     '/'-----')는 true/false를 Random으로 저장한다.
- ex. 참가자: pobi, cron, jh 사다리 높이: 3

```

## Ladder
pobi               cron               jh
|(true) true/false |(true) true/false |(true) <= LadderLine
|(true) true/false |(true) true/false |(true) <= LadderLine
|(true) true/false |(true) true/false |(true) <= LadderLine

=> Ladder(List<LadderLine>)
```


## 요구사항 정리
### step2
- 사다리(Ladder)를 생성한다.
    1. 참가자(Participants)수 만큼 '|'를 생성한다.
    2. 사다리가 연속되지 않도록 크기가 1인 사다리를 생성한다. |-----|-----| (x)
    3. 입력 받은 사다리의 높이 만큼 사다리를 생성한다.
- 참가자(Participants) 생성한다.
    1. 입력받은 참가자의 수가 0보다 작으면 exception을 throw
    2. 입력받은 참가자의 이름이 5자 이상이면 exception을 throw
- 사다리와 참가자를 관리하는 사다리 게임(LadderGame)을 생성한다.
---
### step3
- 실행 결과를 입력 받는다.
- 사다리 게임을 진행 시켜, 참가자와 맞는 사다리 게임 결과를 저장한다.
- 결과를 보고 싶은 사람을 입력받는다.
- 입력 받은 참가자 명에 따른 결과를 출력한다.
- all을 입력 받으면, 실행결과 모두를 출력한다.

### TODO
- 참가자 수와 실행결과의 수가 맞지 않으면, throw exception
### DONE
- 가로 사다리를 생성
    1. 랜덤하게 생성할지 말지를 결정하고, 이전 가로 사다리가 생성되어 있으면 생성하지 않음
- 세로 사다리를 생성
- 가로 사다리, 세로 사다리를 합쳐서 사다리 게임 생성
- TransverseLadder(가로 사다리) indent 1로 수정
- 참가자(Participants)를 생성하는 Class 추가
- 사다리 게임 생성 및 실행 결과 구현
- 중복되는 이름 입력시 Exception을 throw
- 사용하지 않는 메서드 삭제 및 클래스 이름 변경
- Ladder, LadderLine 테스트 코드 작성
- 요구사항 정리
- ErrorMessage 삭제
- Ladder와 Participants 의존성 제거
- TransverseLadder 삭제 및 사다리 생성 전략 별 test code LadderLineTest에 추가
- 입력한 이름의 길이가 5글자 이상이면, exception을 throw하는 테스트 코드 추가
- 사다리 생성 화면 요구사항에 맞게 수정
- Ladder의 size를 Ladder 생성자에서 계산하여 넘길 수 있도록 수정
- ladderSize만으로 사다리를 생성할 수 있도록 개선
- LadderGenerateStrategy 제거
- 실행 결과를 입력 받는다.
- 사다리 생성을 위한 람다식 생성
- 사다리 게임을 진행 시켜, 참발가자와 맞는 사다리 게임 결과를 저장한다.
- LadderSize 객체를 생성하여, Ladder를 생성하는데 필요한 width, hegith를 입력 받는다.
- Participants 와 LadderResult를 합쳐 하나의 LadderGameInformation을 만든다.
(사다리 게임 결과를 생성하는 LadderGame에게 필요한 정보를 모두 제공하기 위해)
- LadderGameResult에서 사다리 게임의 최종 결과를 반환한다.
- 결과 출력 버그 수정
- 입력 받은 참가자 명에 따른 결과를 출력한다.
- all을 입력 받으면, 실행결과 모두를 출력한다.
