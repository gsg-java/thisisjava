## Mini Project

*이 패키지에 자신의 package를 만들고 아래 프로그램을 작성해주세요*

### 자동차

#### 조건

- 그냥 아무렇게나 막 만들어도 모든 자동차는 아래와 같은 조건을 갖는다.(기본차)
    - 연비 10km
    - 속도 100km

- 자동차는 브랜드가 아래와 같다.
    - 현대
        - 현대는 연비 기술이 좋다(+3km)
    - 르노삼성
        - 삼성은 연비 기술이 좋다(+1km)
        - 삼성은 속도 기술이 좋다(+3km)
    - 쉐보레
        - 쉐보레는 연비 기술이 좋다(+4km)
    - 기아
        - 기아는 속도 기술이 좋다(+4km)
    
- 엔진 종류는 아래와 같다.
    - 경차용 엔진
        - 경유 사용
        - 경차는 기본 차보다 연비가 좋다(+5km)
        - 경차는 기본 차보다 속도가 느리다(-10km)
    - 스포츠카용 엔진
        - 휘발유 사용
        - 스포츠카는 기본 차보다 연비가 안좋다(-5km)
        - 스포츠카는 기본 차보다 속도가 빠르다(+10km)
    - SUV용 엔진
        - 휘발유 사용
        - SUV는 기본 차보다 연비가 안좋다(-3km)
        - SUV는 기본 차보다 속도가 빠르다(+5km)
        
    - 승용차용 엔진
        - 휘발유 사용
        - SUV는 기본 차보다 연비가 좋다(+3km)
        - SUV는 기본 차보다 속도가 느리다(-4km)
    
- 주유 종류는 아래와 같다.
    - 경유
    - 휘발유
    
- 각 브랜드는 아래와 같은 차종이 있다.

    - 르노삼성
        - SM5(승용차)
        - QM5(SUV)
    
    - 기아
    
        - 레이(경차)
        - K5(승용차)
        - 스포티치(SUV)
        - 스팅어(스포츠카)
    
    - 현대
    
        - 아토스(경차)
        - 아반테(승용차)
        - 투싼(SUV)
        - 투스카니(스포츠카)
        
    - 쉐보레 
        - 스파크(경차)
        - 말리부(승용차)
        - 올란도(SUV)
        - 카마로(스포츠카)
        
- 쥬유 가격은 아래와 같다.

    - 경유 : 100원/리터
    - 휘발유 : 2000원/리터
    
- 각 브랜드는 주유 할인을 제공한다.

    - 삼성
        - 휘발유 : 리터당 110원
    - 기아
        - 경유 : 리터당 110원
        - 휘발유 : 리터당 100원
    - 현대
        - 경유 : 리터당 120원
        - 휘발유 : 리터당 110원
    - 쉐보레
        - 경유 : 리터당 110원
        
        
- ENUM 사용 금지
- 중복코드 최소화
- 주유량은 단위로만 가능 1L

#### mission

- 서울에서 경주(350km)를 가는데 걸리는 각 자동차의 시간과 비용을 출력하시오.
- 출력 예제 : 스파크 (브랜드 : 쉐보레, 종류 : 경차, 주유 종류 : 경유, 연비 : xx km, 속도 : xx km, 걸린 시간 : xx 시간, 비용 : xx 원)

### Sample

출력 양식만 지켜주세요.

```java
public class Car {
    private int fuelEfficiency = 10;
    private int speed = 100;
    private Brand brand;
    private Engine engine;
    
    public Car(Brand brand, Engine engine) {
            this.brand = brand;
            this.engine = engine;
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] park = {new SampleSportCar("샘플자동차"), new SampleSportCar("샘플자동차2")};
        for(Car car : park){
            System.out.println(car.navigate(350));
        }
    }
}
```