## 김상혁 202130204

## 3월 29일  
**리리털과 정수 리터럴**    
    리터럴 프로그램에서 직접 표현한 값  
    정수 실수 문자 논리 문자열 리터렬 있음  
  
**실수 리터럴**    
    소수점 형태나 지수 형태로 표현한 실수  
    실수타입 리터럴은 double 타입으로 컴파일  
    예시:  
    double d = 0.1234;  
    double e = 1234E-4 // 1234E-4  

**문자 리터럴**   
    단일 인용부호 ('')로 문자를 표현  
    char a = '\'  
    char b = '글자도 넣을 수 있다'  
    char c = uae00; //'글의 유니코드값(ae00) 사용'  

**상수**  
    상수 선언 final 키워드 사용  
    선언 시 초깃값 지정  
    실행 중 값 변경 불가 

**var 키워드**  
    자바 10 부터 도입  
    기존의 변수 선언 방식: 변수의 타입 반드시 지정  
    int price = 200;  
    String name = "kite";  

**타입변환**  
    한 타입의 값을 다른 타입의 값으로 변환  

**자동 타입 변환**  
    컴파일러에 의해 원래의 타입보다 큰 타입으로 자동변환  

**강제 타입 변환**  
    개발자의 의도적 타입 변환  
    ()한에 개발자가 명시적 타입 변환 지정  
    예시:  
    int n = 300  
    byte b = n; //int 타입이 byte 타입 변환 지정  
    강제 변환은 값 손실 우려가 있다  

**자바의 키 입력과 Systen.in**  
System.in  
    키보드와 연결된 자바의 표준 입력 스트림  
    입력되는 키를 바이트(문자아님)로 리턴하는 저수준 스트림  
      
**Scanner**  
    Scanner클래스  
        읽은 바이트를 문자 정수 실수 불린 문자열 등 다양한 타입으로 변환하여 리턴  
        java.util.Scanner  
        객체생성  
        import java.util.Scanner;//임포트 문 필요  
        import 문은 Scanner 클래스의 경로명이 java.util.Scanner임을 알려준다. 이 import문이 없으면 자바 컴파일러가 Scanner 클래스 코드가 어디에 있는지 찾을수 없다.  

**Scanner 클래스를 이용한 키 입력 연습** 
```java
    import java.util.Scanner;
    public class ScannerEx {
        public static void main(String[]){
            System.out.print("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요");
            Scanner scanner = new Scanner (System.in);
            String name = scanner.next();
            System.out.println("당신의 도시는"+name+"입니다");
            Scanner scanner = new Scanner (System.in);
            String city = scanner.next();
            System.out.println("당신의 도시는"+city+"입니다");
            Scanner scanner = new Scanner (System.in);
            String age = scanner.next();
            System.out.println("당신의 나이는"+age+"입니다");
            Scanner scanner = new Scanner (System.in);
            String weight = scanner.next();
            System.out.println("당신의 체중은"+weight+"입니다");
            Scanner scanner = new Scanner (System.in);
            String single = scanner.next();
            System.out.println("당신의 독신여부는"+single+"입니다");
            
            scanner.close();
        }
    }

```
**식과 연산자**  
주어진 식을 계산하여 결과를 얻는 과정을 연산이라고 한다  

**산술 연산**  
수기 계산에 사용하는 산술 연산자는 더하기, 빼기, 곱하기, 나누기, 나머지(+,-,*,/,%)로 5개이다  
/는 몫을 구하며 %는 나머지를 구한다

**증감연산**  
값 1을 증가,감소 시키는 연산이다  
예시:  
```java
    int a = 1;
    a++; // a 값 1 증가, a는 2
    ++a; // a 값 다시 1 증가, a는 3
```
연산자가 변수 앞에 붙을 때 전위 연산자라고 부르고 뒤에 붙을 대 후위연산자 라고 부른다  
이 둘은 모두 값 1을 증가시키는 연산을 실행하지만 전위는 해당 열의 코드를 실행하기 전에,후위는 해당 열의 코드를 실행한 후에 진행한다  

**비교 연산,논리 연산**  
비교연산자: 두 개의 값을 비교하여 ture/false 결과를 만들어낸다  
논리연산자: 두 개의 논리 값에 논리 연산,논리 결과

비교 연산:  
    a < b : a가 b보다 작으면 true  
    a > b : a가 b보다 크면 true  
    a <= b : a가 b보다 작거나 같으면 true  
    a >= b : a가 b보다 크거나 같으면 true  
    a == b : a가 b보다 같으면 true  
    a != b : a가 b보다 다르면 true  

논리 연산:  
    ! a     : a 가 ture 이면 false,false 이면 ture  
    a ^ b   : a와 b의 XOR 연산. a,b가 같으면 false  
    a || b  : a와 b의 or 연산 a,b가 모두 flase일 때에만 false  
    a && b  : a와 b의 and 연산 a,b가 모두 ture 일 때에만 false  

**조건연산**
3개의 피연산자로 구성된 삼항 연산자  
opr1?opr2?opr3?  

**비트 연산**

```java
    byte x = 10;
```  
비트 논리 연산:  
    비트끼리 AND,OR,XOR,NOT 연산  
    피 연산자의 각 비트를 대상으로 하는 연산이다  

비트 시프트 연산:    
    비트를 오른쪽이나 왼쪽으로 이동  

**switch문**  
switch문은 식과 case 문의 값과 비교  
    case의 비교 값과 일치하면 해당 case의 실행문장 수행  
case의 비교 값과 일치하는 것이 없으면 default 문 실행  

switch뮌에서 breadk 문은 중요하다 어떤 case의 실행문장이 실행되고 만난 braek문은 switch문을 벗어나도록 지시한다  
만약에 break문이 없다면 case문의 실행문장으로 break문을 만날 때 까지 계속 실행하여 무한반복한다

```java
char grade = "B";
Switch(grade){
case A
    System.out.println("축하합니다");
    break;
case B
    System.out.println("좋아요");
    break;
case C
    System.out.println("노력하세요");
    break;
case D
    System.out.println("탈락입니다");
    break;

}
```
**for문**  
반복문에서 가장 많이 사용되는 반복문  
for(초기문;반복문;반복후작업){  
    작업문  
}  
작업문은 for문이 반복되는 동안 매번 실행되며 작업문이 하나의 문장인 경우 중괄호가 필요하지 않다  
초기문은 for문의 조건식에서 사용되는 변수를 초기화한다  
변수가 조건식의 논리변수,논리연산에서 true로 있는 한 작업문은 계속해서 반복된다
조건식의 결과가 false가 되면 for문을 벗어난다.

**while**  
while(조건식){  
    작업문  
}  
While문의 조건식은 for문과 동일하다 true인 경우반복이 계속되며 false 인 경우 while을 벗어난다 for문과 달리 조건식이 없으면 오류가 발생한다  

**do-while**  
do{  
    작업문  
}  while(조건식);  
do-while은 while의 조건식과 동일하나 while문과는 다르게 작업문을 실행한 이후에 조건을 비교한다.  

**중첩 반복문**
반복문 안에 다른 반복문을 넣을 수 있다  
이는 for문 안에 while을 넣는건과 while안에 for문을 넣는 등 두 반복문을 호환할 수 있다  

```java
public class Ex3_4 {
    public static void main(String[]args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i+"*"+j+"="+j*i);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
```

**countinue**  
countinue문은 break문과 함께 사용해 반복의 흐름을 변경하거나 반복에서 벗어나게 한다  
for문 반복중 countinue문을 만나면 반복 후 작업으로 분기하고  
while,do-while 반복중 만나면 조건식을 검사하는 과정으로 분기한다  
  
  
  

**배열**  
배열은 인덱스와 인덱스에 대응하는 일련의 데이터들로 이루어진 연속적인 자료구조이다  
    배열에는 같은 종류의 데이터들이 순차적으로 저장된다  
배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간이다  
    원소 데이터들이 순차적으로 저장됨  
    인덱스를 이용하여 원소 데이터 접근  
    반복문을 이용하여 처리하기에 적합한 자료구조  
배열 인덱스  
    0부터 시작  
    인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치  

**배열 선언과 생성**  
```java
    int intArray[];
```  
이 선언문은 레퍼런스 변수intArray를 선언하는 것으로 배열 공간은 생성되지 않는다  
이 선언문으로 아직 배열이 생성되지 않았음으로 intArray의 변수 값은 null이다  
  
배열 생성은 배열 공간을 할당받는 과정이다 반드시 new 연산자를 이용하여 배열을 생성하며 []안에 생성할 원소 개수를 지정한다  
```java
    intArray = new int[5];
```

**배열 인덱스와 배열 원소 접근**
배열의 인덱스는 정수만 가능하다. 인덱스는 0부터 시작한다  
레퍼런스 변수와 [] 사이에 원소긔 인덱스를 적어 접근한다  

```java
    intArray = new int[5];
    intArray[0] = 5;
    intArray[3] = 6;
    int n = int Array[3];
```  
  
**배열의 크기,length필드**
자바의 배열은 객체로 처리  
    배열 객체의 length필드  
```java
    int intArray[];
    intArray = new int[5];

    int size = intArray.length;
```  

## 3월 22일  
    프로젝트 생성,이를 복사하여 기존 프로젝트에 붙여넣었다.  
  
**프로그래밍 언어**  
프로그램 작성 언어의 개요  
    1.기계어  
    2.어셈블리어  
    3.고급언어  

**프로그래밍과 컴파일**  
소스,컴파일의 기본골자  
  
**기존 언어의 플랫폼 종속성**  
    1.기계어가 CPU마다 다름  
    2.운영체제마다 API가 다름  
    3.운영체제마다 실행파일 형식이 다름  
  
**자바 플랫폼의 독립성, WORA**  
    WORA(Write Once Run Anywhere)  
        한번 작성된 코드는 모든 플랫폼에서 바로 실행 가능  
        C/C++등 기존 언어가 가진 플랫폼 종속성이 존재치 않음  
        네트워크에 연결된 어느 클라이언트에서나 실행  
  
    WORA를 가능하게 만드는 자바의 특징  
        바이트코드  
        JVM  

**JDK와 JRE**  
    JDK:자바 응용 개발환경개발에 필요한 도구 포함  
    JRE:자바 실행환경,개발자가 아닌 경우 JRE만 따로 다운받을 수 있음  

**자바 API**  
    JDK에 포함된 클래스 라이브러리  
    개발자는 API를 사용해 업무 난이도 완화,개발 속도를 증진할 수 있다  

**자바 패키지**  
    서로 관련된 클래스들을 분류하여 묶어 놓은 것  
    계층구조로 되어있음  
    자바 API는 JDK에 패키지 형태로 제공됨  
    개발자 자신의 패키지 생성 가능  

**자바 소스 편집**
    어떠한 편집기를 사용해도 작동함(메모장 마저도 사용할 수 있음)  
  
POWERSHELL을 사용해 VS코드나 이클립스를 거치지 않고 작성된 소스코드를 실행해보았다.  
  
**자바응용**  
    서블릿  
        웹 서버에서 실행되는 자바 프로그램  
        데이터베이스 서버 및 기타 서버와 연동하는 복잡한 기능 구현 시 사용  
        사용자 인터페이스가 필요 없는 응용  
        웹 서버에 의해 실행 통제 받음  

**자바의 특징**  
    플랫폼 독립성  
        하드웨어 운영체제에 족속되지 않는 바이트 코드로 플랫폼 독립성  
    객체지향   
        캡슐화 상속 다향성 지원  
    클래스로 캡슐화  
        자바의 모든 변수나 함수는 클래스 내에 선언  
        클래스 안에서 클래스 작성 가능  
    소스와 클래스파일  
        하나의 소스파일에 여러 클래스 작성 가능  
        소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야함  
        클래스 파일에는 하나의 클래스만 존재  
    실행 코드 배포  
    패키지  
    멀티스레드  
    가비지 컬렉션  
    실시간 응용 프로그램에 부적합하다  
        실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행  
    자바 프로그램은 안전  
        타임 체크 엄격  
        물리적 주소를 사용하는 포인터 개념이 없음  
    프로그램 작성이 쉬움  
        포인트 개념이 없음  
        동적 메모리 반환하지 않음  
        다양한 라이브러리 지원  
    실행 속도 개선을 위헌 JIT사용  
        자바는 바이트 코드를 인터프리터 방식으로 실행  
        JIT 컴파일 기법으로 실행 속도 개선  

    자바의 기본 문법(출력,if)에 대해 들었다  


## 3월 15일
**github** 클론 이용법,로컬 PC의 파일을 불러오는 방법과 불러온 파일을 수정하여 커밋하여 github에 업로드 하는것으로 github를 업데이트 하였다
뿐만 아니라 **.gitignore** 를 통해 github에 노출되지 않는 내용을 삽입하는 방법을 학습하였다.
그 외에 **git graph**를 이용하여 버전관리,태그를 배웠다

## 3월 8일
오리엔테이션과 
github 계정 생성을 포함한 github와 vscode연동 markdawn기본 문법