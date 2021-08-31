
# 2장. Hamcrest


## JUnit

JUnit은 만들어진 방식이나 구조 자체에서도 배울점이 매우 많은 소프트웨어이다. 단위 테스트를 수행하는데 있어 기본적으로 다음과 같은 기능을 제공한다.


- 테스트 결과가 예상과 같은지를 판별해주는 단정문(assertions)
- 여러 테스트에서 공용으로 사용할 수 있는 테스트 픽스처(test fixture)
- 테스트 작업을 수행할 수 있게 해주는 테스트 러너(test runner)


JUnit이 널리퍼진 이유 중 하나는 목표가 ㄱ단순하고, 하고자 하는 일이 명료했기 때문이다.


## 테스트 픽스처

> 테스트를 반복적으로 수행할 수 있게 도와주고 매번 동일한 결과를 얻을 수 있게 도와주는 **`기반이 되는 상태나 환경`** 이다. 


**일관된 테스트 실행환경** 이라고도 하며, 때로는 `테스트 컨텍스트`라 부르기도 한다.


### 텍스트 픽스처 메소드

테스트 픽ㅊ스처를 만들고 정리하는 작업을 수행하는 메소드.


## JUnit3

#### JUnit3 규칙

1. TestCase 를 상속받는다.
2. 테스트 메소드의 이름은 반드시 test로 시작해야 한다.


### `JUnit3 구성요소1` 테스트 픽스처 메소드

- setUp()
-tearDown()


### `JUnit3 구성요소2` 단정문

대표적인 단정문

- assertEquals([message], expected, actual)
- assertTrue([message], expected) / assertFalse([message], expected)


#### assertEquals([message], expected, actual)


