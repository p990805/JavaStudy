<details>
    <summary>2025.06.17 / Object</summary>
    
# Java lang 패키지와 Object 클래스

## 1. java.lang 패키지 소개

### 개요
- 자바가 기본으로 제공하는 가장 기본적인 클래스들의 모음
  - `lang`은 Language(언어)의 줄임말
  - **자동 import**: 모든 자바 애플리케이션에 자동으로 임포트됨

### 주요 클래스들
- **Object**: 모든 자바 객체의 부모 클래스
  - **String**: 문자열 처리
  - **Integer, Long, Double**: 래퍼 타입 (기본형 → 객체)
  - **Class**: 클래스 메타 정보
  - **System**: 시스템 관련 기본 기능

### import 생략 가능
```java
// import 구문 없이 사용 가능
public class LangMain {
    public static void main(String[] args) {
        System.out.println("hello java"); // java.lang.System
    }
}
```

---

## 2. Object 클래스

### 기본 개념
- **모든 클래스의 최상위 부모 클래스**
  - 상속받을 부모가 없으면 **묵시적으로 Object를 상속**

```java
// 다음 두 코드는 동일함
public class Parent {
    // 묵시적으로 extends Object
}

public class Parent extends Object {
    // 명시적으로 extends Object
}
```

### 상속 구조 예제
```java
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
```

### Object가 최상위 부모인 이유

#### 1. 공통 기능 제공
- 모든 객체에 필요한 기본 기능을 통일된 방식으로 제공
  - `toString()`: 객체 정보 제공
  - `equals()`: 객체 비교
  - `getClass()`: 클래스 정보 제공

#### 2. 다형성의 기본 구현
- 모든 객체를 Object 타입으로 참조 가능
  - 통합적인 객체 처리 가능

---

## 3. Object 다형성

### 다형적 참조
Object는 모든 클래스의 부모이므로 모든 객체를 참조할 수 있습니다.

```java
class Dog {
    public void sound() {
        System.out.println("멍멍");
    }
}

class Car {
    public void move() {
        System.out.println("자동차 이동");
    }
}

public class ObjectPolyExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        
        action(dog);  // Dog → Object
        action(car);  // Car → Object
    }
    
    private static void action(Object obj) {
        // 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
```

### Object 배열
```java
Object[] objects = {new Dog(), new Car(), new Object()};

// 위 코드는 아래와 동일함
Object[] objects = new Object[3];
objects[0] = new Dog();
objects[1] = new Car();
objects[2] = new Object();
```
세상의 모든 객체를 담을 수 있는 배열을 만들 수 있습니다.

### 다형성의 한계
- Object에는 각 클래스의 고유 메서드가 없음
  - 메서드 호출 시 다운캐스팅 필요
  - 메서드 오버라이딩 활용 제한적

---

## 4. toString() 메서드

### 기본 동작
```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

### 사용 예제
```java
Object obj = new Object();
System.out.println(obj.toString());  // java.lang.Object@a09ee92
System.out.println(obj);             // 동일한 결과 (println이 내부적으로 toString 호출)
```

### toString() 오버라이딩
```java
public class Dog {
    private String dogName;
    private int age;
    
    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}

// 출력 결과: Dog{dogName='멍멍이2', age=5}
```

### Object와 OCP 원칙
```java
public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
```

**OCP(Open-Closed Principle) 적용:**
- **Open**: 새로운 클래스 추가 시 toString() 오버라이딩으로 기능 확장
  - **Closed**: ObjectPrinter 코드는 변경하지 않아도 됨

---

## 5. equals() 메서드

### 동일성 vs 동등성

#### 동일성 (Identity)
- `==` 연산자 사용
  - **물리적으로 같은 메모리 참조**인지 확인

#### 동등성 (Equality)
- `equals()` 메서드 사용
  - **논리적으로 같은 값**인지 확인

```java
String s1 = new String("hello");
String s2 = new String("hello");

System.out.println(s1 == s2);      // false (동일성: 다른 객체)
System.out.println(s1.equals(s2)); // true (동등성: 같은 값)
```

### Object.equals() 기본 구현
```java
public boolean equals(Object obj) {
    return (this == obj);  // 기본적으로 동일성 비교
}
```

### equals() 오버라이딩 예제
```java
public class User {
    private String id;
    
    public User(String id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
}
```

### equals() 구현 규칙
1. **반사성**: `x.equals(x)`는 항상 true
   2. **대칭성**: `x.equals(y)`가 true면 `y.equals(x)`도 true
   3. **추이성**: `x.equals(y)`와 `y.equals(z)`가 true면 `x.equals(z)`도 true
   4. **일관성**: 객체 상태가 변경되지 않으면 항상 같은 결과 반환
   5. **null 비교**: 모든 객체는 null과 비교 시 false 반환

---

## 💡 핵심 정리

### 📚 주요 개념 정리

#### Q: Java.lang 패키지의 클래스는 별도의 import 문 없이 사용할 수 있는 이유는?
**A:** 컴파일러가 자동으로 추가해주기 때문

#### Q: 자바의 모든 클래스들이 최상위 부모로 상속받는 클래스는?
**A:** Object 클래스

#### Q: 클래스가 다른 부모 클래스를 명시적으로 상속받지 않을 때, 어떤 일이 자동으로 일어나는가?
**A:** Object 클래스를 자동으로 상속한다

#### Q: 자바에 Object 클래스가 존재하는 주된 이유는?
**A:** 공통 기능 제공 & 다형성 기반 마련

#### Q: Object 타입으로 참조되는 dog 객체의 sound() 메소드를 호출하려면?
**A:** Dog 타입으로 다운캐스팅 필요

#### Q: Object 타입의 배열에는 어떤 종류의 요소들을 담을 수 있는가?
**A:** Object를 상속받은 모든 객체 (즉, 모든 객체)

#### Q: Object 클래스의 toString() 메소드는 어떤 용도로 사용되는가?
**A:** 객체 정보의 문자열 표현

#### Q: 자바에서 == 연산자와 equals() 메소드는 객체 비교 시 각각 무엇을 비교하는가?
**A:**
- `==`: 물리적 동일성 (메모리가 같은지, 참조값이 같은지)
  - `equals()`: 논리적 동등성 (값이 같은지)

#### Q: System.out.println(obj)처럼 Object 타입을 받아 toString()을 호출하는 방식이 OCP(개방-폐쇄 원칙)를 어떻게 잘 지키는 예시인가?
**A:** 새로운 객체 타입 추가 시 println 코드가 변경되지 않음

---

</details>