## Mini Project

*이 패키지에 자신의 package를 만들고 아래 프로그램을 작성해주세요*

### 자동차

#### 조건

- 자동차는 브랜드가 아래와 같다.
    - 현대
    - 르노삼성
    - 쉐보레
    - 기아
    
- 자동차 종류는 아래와 같다.
    - 경차
    - 스포츠카
    - SUV
    - 승용차
    
- 주유 종류는 아래와 같다.
    - 경유
    - 휘발유
    
- 각 브랜드는 아래와 같은 차종이 있다.

    - 르노삼성
    
        - SM5(승용차, 휘발유, 연비:10km, 속도:10km/h)
        - QM5(SUV, 휘발유, 연비:7km, 속도:12km/h)
    
    - 기아
    
        - 레이(경차, 경유, 연비:16km, 속도:6km/h)
        - K5(승용차, 휘발유, 연비:9km, 속도:9km/h)
        - 스포티치(SUV, 휘발유, 연비:8km, 속도:13km/h)
        - 스팅어(스포츠카, 휘발유, 연비:5km, 속도:20km/h)
    
    - 현대
    
        - 아토스(경차, 경유, 연비:17km, 속도:7km/h)
        - 아반테(승용차, 휘발유, 연비:11km, 속도:11km/h)
        - 투싼(SUV, 휘발유, 연비:9km, 속도:12km/h)
        - 투스카니(스포츠카, 휘발유, 연비:4km, 속도:18km/h)
        
    - 쉐보레 
        - 스파크(경차, 경유, 연비:18km, 속도:8km/h)
        - 말리부(승용차, 휘발유, 연비:12km, 속도:14km/h)
        - 올란도(SUV, 휘발유, 연비:6km, 속도:17km/h)
        - 카마로(스포츠카, 휘발유, 연비:3km, 속도:22km/h)
        
- 쥬유 가격은 아래와 같다.
    - 경유 : 500원/리터
    - 휘발유 : 800원/리터
    
- 차이 따라 주유 할인을 받을 수 있다.
    - 삼성
        - SUV : 리터당 300원
        - 승용차 : 리터당 350원
    - 기아
        - 경차 : 리터당 350원
        - 스포츠카 : 리터당 250원
        - SUV : 리터당 240원
        - 승용차 : 리터당 230원
    - 현대
        - 경차 : 리터당 340원
        - 스포츠카 : 리터당 240원
        - SUV : 리터당 220원
        - 승용차 : 리터당 210원
    - 쉐보레
        - 경차 : 리터당 360원
        - 스포츠카 : 리터당 270원
        - SUV : 리터당 260원
        - 승용차 : 리터당 200원
        
        
- ENUM 사용 금지
- 모든 조건을 클래스화(class, interface, abstract class)
- 모든 자동차가 출고시의 주유량은 1L
- 모든 주유소는 5L씩만 주유 가능

#### mission

- 서울에서 경주(350km)를 가는데 걸리는 각 자동차의 시간과 비용을 출력하시오.
- 주유소 순서 : S-OIL, 현대 오일 뱅크, SK, GS  반복
- 출력 예제 : 스파크 (브랜드 : 쉐보레, 주유 종류 : 경유, 걸린 시간 : xx 시간, 비용 : xx 원)

###Sample

출력 양식만 지켜주세요.

```java
//public interface Car
//public abstract class SampleCar implements Car
//public class SampleSportCar extends SampleCar

public class Main {
    public static void main(String[] args) {
        Car[] park = {new SampleSportCar("샘플자동차"), new SampleSportCar("샘플자동차2")};
        for(Car car : park){
            System.out.println(car.navigate(350));
        }
    }
}
```