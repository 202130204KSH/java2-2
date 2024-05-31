# 김상혁 202130204

  
### 목차  
[5월 31일](#5월-31일)  
[5월 24일](#5월-24일)  
[5월17일](#5월-17일)  
[5월3일](#5월-03일)  
[4월19일](#4월-19일)  
[4월12일](#4월-12일)  
[4월5일](#4월-05일)  
[3월29일](#3월-29일)  
[3월22일](#3월-22일)  
[3월15일](#3월-15일)  
[3월8일](#3월-8일)  
  
## 김상혁 202130204  

#####   ◆
  
        ■
            □
                ┗
  
## 5월 31일  
  
#####   ◆자바의 GUI 프로그래밍 방법
  
        ■컴포넌트 기반의 GUI 프로그래밍  
            □스윙 컴포넌트를 이용하여 쉽게 GUI를 구축  
            □자바에서 제공하는 컴포넌트의 한계를 벗어나지 못함  
        ■그래픽 기반 GUI 프로그래밍  
            □그래픽을 이용하여 GUI구축  
  
#####   ◆스윙 컴포넌트의 공통 메소드 JComponent의 메소드  
  
        ■JComponent  
            □스윙 컴포넌트는 모두 상속받는 슈퍼클래스  
            □스윙 컴포넌트들이 상속받는 공통 메소드와 상수 구현  
    
        ■JComponent의 주요 메소드 사례  
            □컴포넌트의 묘양과 관련된 메소드  
```java
void setForeground(Color)
void setBackground(Color)
void setOpaque(boolean)
void setFont(Font)
Font getFont()
```
            □컴포넌트의 상태와 관련된 메소드  
```java
void setEnabled(boolean)
void setVisible(boolean)
boolean isVisible()
```
            □컴포넌트의 위치와 크기에 관련된 메소드
```java
int getwidth()
int getHeight()
int getX()
int getY()
Point getLocationOnscreen()
void setLocation(int,int)
void setSize(int,int)
```
            □컨테이너를 위한 메소드
```java  
Component add(Component)
void remove(Component)
void removeALL()
Component[] getComponent()
Container getParent()
Container getTopLevelAncestor()
```
            ▶예제  
```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComponentEx extends JFrame{
    public JComponentEx() {
    super("JComponent예제");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
        
    JButton b1 = new JButton("Magenta/Yellow Button");
    JButton b2 = new JButton("Disabled Button");
    JButton b3 = new JButton("getX(),getY()");

    b1.setBackground(Color.YELLOW);
    b1.setForeground(Color.MAGENTA);
    b1.setFont(new Font("Arial", Font.ITALIC,20));
    b2.setEnabled(false);
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            setTitle(b.getX()+","+b.getY());
        }
    });

    c.add(b1); c.add(b2); c.add(b3);

    setSize(260,200); setVisible(true);

    }
    public static void main(String[] args) {
        new JComponentEx();
    }     
}
```
  
#####   ◆
  
        ■
            □
                ┗
  
## 5월 24일  
  
#####   ◆이벤트 기반 프로그래밍  
  
        ■이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식  
            □이벤트가 발생하면 이벤트를 처리하는 루틴(이벤트 리스너)실행  
            □실행될 코드는 이벤트의 발생에 의해 전적으로 결정  
        ■반대되는 개념:배치 실행  
            □프로그램의 개발자가 프로그램의 흐름을 결정하는 방식  
        ■이벤트 종류  
            □사용자의 입력:마우스,키보드 입력  
            □센서로부터의 입력,네트워크로부터 데이터 송수신  
            □다른 응용프로그램이나 다른 스레드로부터의 메시지  
        ■이벤트 기반 응용 프로그램의 구조  
            □각 이벤트마다 처리하는 리스너 코드 보유  
        ■GUI 프로그램은 이벤트 기반 프로그래밍으로 작성됨  
            □GUI 라이브러리 종류  
                ┗C++의 MFC C# GUI Visual Basic, X window, Android 등  
                ┗자바의 AWT와 Swing  
  
#####   ◆자바 스윙 프로그램에서 이벤트 처리 과정  
  
        ■이벤트 발생  
            □EX:마우스의 움직임 혹은 키보드 입력  
        ■이벤트 객체 생성  
            □현재 발생한 이벤트에 대한 정보를 가진 객체  
        ■응용 프로그램에 작성된 이벤트 리스너 찾기  
        ■이벤트 리스너 실행  
            □리스너에 이벤트 객체 전달  
            □리스너 코드 실행  
  
#####   ◆이벤트 객체  
  
        ■발생한 이벤트에 관한 정보를 가진 객체  
        ■이벤트 리스너에 전달됨  
            □이벤트 리스너 코드가 발생한 이벤트에 대한 상황을 파악할 수 있게 함  
  
        ■이벤트 객체가 포함하는 정보  
            □이벤트 종류와 이벤트 소스  
            □이벤트가 발생한 화면 좌표 및 컴포넌트 내 좌표  
            □이벤트가 발생한 버튼이나 메뉴 아이템의 문자열  
            □클릭된 마우스 버튼 번호 및 마우스의 클릭회수  
            □키의 코드 값과 문자 값  
            □체크박스 라디오 버튼등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태  
  
        ■이벤트 소스를 알아내는 메소드  
            □Object getSource()  
                ┗발생한 이벤트의 소스 컴포넌트 리턴  
                ┗Object 타입으로 리턴하므로 캐스팅하여 사용  
                ┗모든 이벤트 객채에 대해 적용  
  
#####   ◆리스너 인터페이스  
  
        ■이벤트 리스너  
            □이벤트를 처리하는 자바 프로그램 코드,클래스로 작성  
        ■자바는 다양한 리스너 인터페이스를 제공  
            □EX:ActionListener  
            □EX:MyActionListener  
  
#####   ◆이벤트 리스너 작성 과정 사례
  
        ■이벤트와 이벤트 리스너 선택  
            □버튼 클릭을 처리하고자 하는 경우  
                ┗이벤트:Action 이벤트, 이벤트 리스너 ActionListener  
        ■이벤트 리스너 클래스 작성:ActionListener 인터페이스 구현  
  
```java
class Myactionlisterner implements ActionListener {
    public void actionPerFormen(ActionEvent e){
        JButton b=(JButton)e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else
            b.setText("action");
    }
}
```  
  
#####   ◆이벤트리스너 작성 방법  

        ■3가지 방법  
            □독립 클래스로 작성  
                ┗이벤트 리스너를 완전한 클래스로 작성  
                ┗이벤트 리스너를 여러 곳에서 사용할 때 적합  
            □내부 클래스(inner class)로 작성  
                ┗클래스 안에 멤버처럼 클래스 작성  
                ┗이벤트 리스너를 특정 클래스에서만 사용할 때 적합  
            □익명 클래스(anonymous class)로 작성  
                ┗클래스의 이름 없이 간단히 리스너 작성  
                ┗클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합하다  
  

```java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");

        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(250,120);
        setVisible(true);
    }
        public static void main(String [] args){
            new IndepClassListener();
        }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action")){
            b.setText("액션");
        }else{
            b.setText("Action");
        }
    }
}
```  
  

#####   ◆익명 클래스로 이벤트 리스너 작성  
  
        ■익명 클래스:이름 없는 클래스  
            □클래스 선언+인스턴트 생성을 한번에 달성  
        ■간단한 리스너의 경우 익명 클래스 사용 추천  
            □메소드의 개수가 1,2개인 리스너에 대해 주로 사용  
  

#####   ◆어댑터 클래스  
  
        ■이벤트 리스너 구현에 따른 부담  
            □리스너의 추상 메소드를 모두 구현해야 하는 부담  
        

#####   ◆KEY 이벤트와 포커스  
   
        ■키 입력시 다음 세 경우 각각 Key 이벤트 발생  
            □키를 누르는 순간  
            □누른 키를 데는 순가  
            □누른 키를 떼는 순간(Unicode키의 경우에만)  
        ■키 이벤트를 받을 수 있는 조건  
            □모든 컴포넌트  
            □현재 포커스(focus)를 가진 컴포넌트가 키 이벤트 독점  
        ■포커스  
            □컴포넌트나 응용 프로그램이 키 이벤트를 독점하는 권한  
            □컴포넌트에 포커스 설정 방법  
                ┗component.setFocusable(true);  
                ┗component.requestFocus();  
  

#####   ◆유니코드(Unicode)키  
  
        ■유니코드 키의 특징  
            □국제 산업 표준  
            □전 세계의 문자를 컴퓨터에서 일관되기 표현하기 위한 코드 체계  
            □문자들에 대해서만 키 코드 값 정의  
                ┗A~Z,a~z,0~9,!@&등  
            □문자가 아닌 키의 경우에는 표준화된 키 코드값이 없다  
  

#####   ◆가상 키와 입력된 키 판별  
  
        ■keyEvent 객체  
            □입력된 키 정보를 가진 이벤트 객체  
            □keyEvent 객체의 메소드로 입력된 키 판별  
        ■KeyEvent 객체의 메소드로 입력된 키 판별  
            □char KeyEvent getKeyChar()  
                ┗키의 유니코드 문자 값 리턴  
                ┗Unicode 문자 키인 경우에만 이미 있음  
                ┗입력된 키를 판별하기 위해 문자 값과 비교하면 됨  
        ■int KeyEvent getKeyCode()  
            □유니코드 키 포함  
            □모든 키에 대한 정수형 키 코드 리턴  
  
  
## 5월 17일  

#####    ◆컨테이너와 배치 배치관리자 개념  

           ■컨테이너의 배치관리자  
               □컨테이너 마다 하나의 배치관리자 존재  
               □컨테이너에 부착되는 컴포넌트의  

#####    ◆배치관리자 대표유형 4가지  

            ■FlowLayout 배치관리자  
               □컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치  
               □배치할 공간이 없으면 아래로 내려와서 반복한다.  

            ■BorderLayout 배치관리자  
               □컨테이너의 공간을 동,서,남,북,중앙 의 5개 영역으로 나눔  
               □5개의 영역중 응용 프로그램에서 지정한 영역에 컴포넌트 배치  

            ■GridLayout 배치관리자  
              □컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눔  
              □컴포넌트는 삽입 순서대로 좌에서 우로,다시 위에서 아래로 배치  

            ■CardLayout  
                □컨테이너의 공간에 카드를 쌓아놓은 듯이 컴포넌트를 배치  

#####   ◆컨테이너에 새로운 배치관리자 설정  

            ■setLayOut(LayoutManger Im)메소드 호출  
                □Im을 새로운 배치관리자로 설정  

#####   ◆FlowLayout
  
        ■FlowLayout 배치관리자    
            □컴포넌트를 컨테이너 내에 왼쪽에서 오른쪽으로 배치  
                ┗다시 위에서 아래로 순서대로 배치  
  
        ■FlowLayout 생성자  
            □FlowLayOut()  
            □FlowLayout(int align,int hGap,int vGap)  
                ┗align 컴포넌트를 정렬하는 방법 지정:왼쪽정렬 오른쪽 정렬 중앙정렬  
                ┗hGap 좌우 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 5  
                ┗vGap 상하 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 5  
  
```java
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIt_ON_CLOASE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.Left,30,40));

        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));
        
        setSize(300,200);
        setVisible(true);
    }
    Public static void main(String[] args){
        new FlowLayoutEx();
    }
}

```
  
#####   ◆BorderLayout  
  
        ■배치방법  
            □컨테아너 공간을 5구역으로 분활 배치  
                ┗동 서 남 북 중앙  
            □add(Component comp,int index)  
        ■생성자  
            □BorderLayout()  
            □BorderLayout(int hGap,int vGap)  
                ┗hGap 좌우 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 0  
                ┗vGap 상하 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 0  
  
```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIt_ON_CLOASE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout(30,20));

        contentPane.add(new JButton("add"),BorderLayout.NORTH);
        contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"),BorderLayout.EAST);
        contentPane.add(new JButton("div"),BorderLayout.WEST);
        contentPane.add(new JButton("Calculate"),BorderLayout.CENTER);
        
        setSize(300,200);
        setVisible(true);
    }
    Public static void main(String[] args){
        new BorderLayoutEx();
    }
}

```

#####   ◆GridLayout
  
        ■배치방법  
            □컨테이너 공간을 동일한 사각형 격자로 분활하고 각 셀에 컴포넌트 하나씩 배치  
                ┗생성자에 행수와 열수 지정  
        ■생성자  
            □GridLayout()  
            □GridLayout(int rows,int cols)  
            □GridLayout(int rows, int cols, int hGap, int vGap)  
                ┗rows:그리드 행의 수, 디폴트값은 1  
                ┗cols:그리드 열의 수, 디폴트값은 1  
                ┗hGap 좌우 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 0  
                ┗vGap 상하 두 컴포넌트 사이의 수평간격 픽셀단위 디폴트값은 0  

```java
import java.awt.*;
import javax.swing.*;

public class GridLayoutEX extends JFrame{
    public GridLayoutEX(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(4,3));

        for(int i=0;i<10;i++){
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[]args){
        new GridLayoutEX();
    }
}
```
    
#####   ◆배치관리자 없는 컨테이너
  
        ■배치관리자가 필요 없는 컨테이너가 필요한 경우  
            □컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우  
            □게임 프로그램과 같이 시간이나 마우스,키보드 입력에 따라 컴포넌트들의 위칙와 크기가 수시로 변하는 경우  
            □여러 컴포넌트들이 서로 겹치는 효과를 연출하고자 하는 경우  

```java

import javax.swing.*;
import java.awt.*;

public class NullContainerEX extends JFrame{
    public NullContainerEX(){
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cotentPahe = getContentPane();

        contentPahe.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130,50);
        la.setSize(200,20);
        contentPahe(la);

        for(int i=1;i<=9;i++)
        {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            contains.add(b);
        }

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[]args){
        new NullContainerEX();
    }
}

```
                


## 5월 03일  

#####   ◆컬렉션  
  
    ■요소라고 불리는 가변 개수의 객체들의 저장소  
        □객체들의 컨테이너라고도 불림  
        □요소의 개수에 따라 크기 자동 조절  
        □요소의 삽입 삭제에 따른 요소의 위치 자동이동  
    ■고정 크기의 배열을 다루는 어려움 해소  
    ■다양한 객체들의 삽입 삭제 검색 등의 관리용이  
  
#####   ◆컬렉션의 특징  
  
    ■제너릭  
        □특정 타입만 다루지 않고 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화 시키는 기법  
        □클래스나 인터페이스 이름에 <E> <K> <V>등 타입 매개변수 포함 
    ■제너릭 컬렉션 사례:벡터<E>  
        □<E>에서 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용  
        □정수만 다루는 컬렉션 벡터  
        □문자열만 다루는 컬렉션 벡터  
  
#####   ◆벡터의 특징  
  
        ■<E>에서 사용할 요소의 특정 타입으로 구체화  
        ■배열을 가변 크기로 다룰 수 있게 하는 컨테이너  
            □배열의 길이 제한 극복  
            □요소의 개수가 넘치면 자동으로 길이 조절  
        ■요소 객체들을 삽입 삭제 검색하는 컨테이너  
            □삽입 삭제에 따라 자동으로 요소의 위치 조정  
  
**ArrayList**  

    ■가변크기 배열을 구현한 클래스  
        ┗스레드간 동기화를 지원하지 않음  
    ■ArrayList는 인덱스 요소로 접근하도록 지원함  

**컬렉션의 순차 검색을 위한 Iterator**  
  
    ■인터페이스  
        ┗리스트 구조의 컬렉션에서 요소의 순차검색을 위한 인터페이스  
        ▷ Vector<E> ArrayList<E> LinkList<E>가 상속받는 인터페이스  
    ■Interator객체 얻어내기  
        ┗해당 컬렉션을 순차검색할 수 있는 Interator  

**HashMap<K,V>**  

    ■키(Key),값(Value)의 쌍으로 구성된 요소를 다루는 컬렉션  
        ┗K:키로 사용할 요소의 타입  
        ┗V:값으로 사용할 요소의 타입  
        ┗키와 값이 한쌍으로 삽입  
        ┗값을 검색하기 위해서는 반드시 키를 이용  
    ■삽입 및 검색이 빠른 특징  
        ┗요소 삽입:put()메소드  
        ┗요소 검색:get()메소드  
    ■HashMap<String,String>생성,요소 삽입,요소 검색  

**자바 GUI**  
    ■GUI  
        ┗사용자가 관리하게 입출할 수 있도록 그래픽으로 화면을 구성하고 마우스나 키보드로 입력받을 수 있도록 지원하는 사용자 인터페이스  
    ■자바언어에서 GUI응용 프로그램 작성  
        ┗AWT와 Swing패키지에 강력한 GUI컴포넌트 제공  
        ┗쉬운 GUI프로그램  
         
    ■AWT와 Swing패키지  
    □AWT패키지  
        ┗자바가 처음 나왔을 때 배포된 GUI패키지  
        ┗AWT컴포넌트는 중앙 컴포넌트  
    □Siwng패키지  
        ┗AWT기술을 기반으로 작성된 자바 라이브러리  
        ┗모든 AWT기술+ 추가된 풍부하고 화려한 고급 컴포넌트  
        ┗AWT컴포넌트를 모두 스윙으로 재작성 AWT컴포넌트 이름 앞에 J를 덧붙임  
        ┗순수 자바 언어로 구현  
        ┗스윙 컴포넌트는 경량 컴포넌트  
          
**스윙 GUI 만들기**  
    ■스윙 프레임 만들기  
    ■main()메소드 지정  
    ■스윙 프레임에 스윙 컴포넌트 붙이기  

    ■스윙 프레임:모든 스윙 컴포넌트를 담는 최상위 컨테이너  
        ┗JFrame을 상속받아 구현  
        ┗컴포넌트들은 화면에 보이려면 스윙 프레임에 부착되어 있어야 함  
  
    ■스윙 프레임 기본구성  
        ┗프레임-스윙 프레임의 기본 툴  
        ┗메뉴바-메뉴들이 부착되는 공간  
        ┗컨텐츠팬-GUI컴포넌트들이 부착되는 공간  
    
**프레임에 컴포넌트 붙이기**  
    ■타이틀 달기  
        ┗super()나 setTitle()이용  
    ■컨텐트팬에 컴포넌트 달기
        ┗컨텐트 팬이란? ▷ 스윙 컴포넌트들이 부착되는 공간  
        ┗스윙 프레임에 붙은 디폴트 컨텐트팬 알아내기  
        ┗컨텐트 팬에 컴포넌트 붙이기  
        ┗컨텐트 팬 변경  
  
## 4월 19일  
  
#####   ◆메소드 오버라이딩  
  
        ■서브 클래스에서 슈퍼 클래스에 선언된 메소드를 중복 작성하여 슈퍼클래스에 작성된 메소드를 무력화시키고  
        객체의 주인노릇을 하는것이다  
        ■슈퍼클래스에 작성된 메소드의 이름,리턴타입,매개변수 리스트가 모두 같도록 작성되어야 한다  

 
#####   ◆추상 클래스  
  
        ■추상 메소드  
            □abstract키워드와 함께 원헝면 선언되고 코드는 작성되지 않은 코드이다  
        ■추상 클래스 선언  
            □추상 메소드를 최소 한 개 이상 가지고 abstract로 선언된 클래스  
            □추상 메소드가 없어도 abstract로 선언한 클래스  
        ■추상 클래스의 인스턴트를 생성할 수 없다  
            □응용 프로그램에는 추상 클래스의 인스턴트 객체를 생성할 수 없다  
        ■ 추상 클래스 상속과 구현  
            □추상 클래스를 상속받으면 추상 클래스가 됨  
            □서브 클래스도 abstract로 선언해야 함  
        ■추상 클래스 구현  
            □서브 클래스에서 슈퍼 클래스의 추상 메소드 구현  
            □추상 클래스를 구현한 서브 클래스는 추상 클래스 아님  
        ■추상 클래스의 목적  
            □상속을 위한 슈퍼 클래스로 활용  
            □서브 클래스에서 추상 메소드 구현  
            □다향성 실현  
  
#####   ◆자바 인터페이스  
  
    ■상수는 public static속성이며 속성은 생략 가능하다  
    ■추상 메소드는 속성이 public abstract로 정해져 있으며 생략 가능하다.
    ■default메소드의 접근지정은 public으로 고정되어있으며 생략 가능하다  
    ■private메소드는 인터페이스 내의 다른 메소드에서만 호출 가능하다  
    ■static메소드의 경우 접근 지정이 생략되면 public이며 private로 지정 가능하다  
    ■default,private,static 메소드들은 코드가 작성되어 있어야 한다.  
    ■인터페이스 객체는 생성할 수 없다  
    ■인터페이스 상속  
        □인터페이스는 다른 인터페이스를 상속할 수 있다.  
        □상속시 extends 키워드를 이용하며  
        PhoneInterface를 상속받아 MobilePhoneInterface인터페이스를 작성한 사례이다.  
  
    ```java
    interface MobilePhoneInterface extends PhoneInterface{
        void sendSMS();
        void sendiveSMS();
    }
    ```

#####   ◆자바의 패키지 모듈  
  
        ■패키지  
            □서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어놓은 디렉터리  
            □하나의 응용 프로그램은 한개 이상의 패키지로 작성  
            □패키지는 jar파일로 압축할 수 있음  
        ■모듈  
            □여러 패키지와 이미지 등의 자원을 모아놓은 컨테이너  
            □하낭늬 모듈을 하나의 jmod파일에 저장  
        ■java9부터 모듀롸 도입  
            □플랫폼의 모듈화  
        ■응용 프로그램의 모듈화  
            □클래스들은 패키지로 만들고 다시 패키지를 모듈로 만듦  
  
#####   ◆자바의 모듈화의 목적  
  
        ■java9부터 자바 API를 여러 모듈(99개)로 분활  
            □java88까지는 rj.jar의 한 파일에 모든 API가 저장  
        ■응용 프로그램이 실행할 때 까지 꼭 필요한 모듈들로만 실행 환경 구축  
            □메모리 자원이 열악한 작은 소형 기기에 꼭 필요한 모듈로 구성된 작은 크기의 실행 이미지를 만들기 위함  
        ■모듈의 현실  
            □java9부터 전면적으로 도입  
            □큰 자바 응용 프로그램에 적합  
  
#####   ◆자바 API의 모듈 파일들  
  
        ■자바 JDK에 제공되는 모듈 파일들  
            □자바가 설치된 jmods디렉터리에 모듈 파일 존재  
    
#####   ◆패키지 만들기  
  
        ■클래스 파일이 저장되는 위치  
            □클래스나 인터페이스가 컴파일되면 클래스 파일 생성  
        ■클래스 파일은 패키지로 선언된 디렉터리에 저장  
        ■패키지 선언  
            □소스 파일의 맨 앞에 컴파일 후 저장될 패키지 지정  
  
```java
public interface PhoneInterface {
    final int Time = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("**Phone**");
    }    
}

class samsungPhone implements PhoneInterface {
    @Override
    public void sendCall(){
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall(){
        System.out.println("전화왔습니다.");
    }
    public void flash() { System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class EX5_6 {
    public static void main(String[]arg){
        samsungPhone Phone = new samsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
```
  
#####   ◆객체속성  
  
        ■Object 클래스의 hashCode(), toString() 메소드는  
        객체의 해시 코드 값,객체를 나타내는 문자열 정보를 제공한다.  
  
#####   ◆Wrapper 클래스  
  
        ■자바의 기본 타입을 정의한 8개의 클래스를 통칭  
            □객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 Wrapper 객체로 만들어 사용  
  
#####   ◆박싱과 언박싱  
  
        ■박싱  
            □기본 타입의 값을 Wrapper객체로 변환하는것  
        ■언박싱  
            □Wrapper객체의 값을 기본 타입으로 변환하는것  
  
    

## 4월 12일  
**자바의 패키지 개념**  


**접근 지정자**  
    -private  
    -protected  
    -public  
    -접근 지정자 생략  

    클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용  

    객체 지향 언어의 캡슐화 정책은 멤버를 보호하는것  
        -접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적  

**클래스 접근 지정**  
    다른 클래스에서 사용하도록 허용할 지 지정  
    public 클래스  
        -다른 모든 클래스에게 접근 허용  
    디폴트 클래스(접근지정자 생략)  
        -pakage-private라고도 함  
        같은 패키지의 클래스에만 접근 허용  

**멤버 접근 지정**  
    public멤버  
        -패키지에 관계없이 모든 클래스에게 접근 허용  
    private멤버  
        -동일 클래스 내에만 접근 허용  
        -상속 받은 서브 클래스에서 접근 불가  
    protected멤버  
        -같은 패키지 내의 다른 모든 클래스에 접근 허용  
        -상속클래스라면 다른 패키지에 있더라도 접근 허용  

```java
class Sample{
    public int a;
    private int b;
    int c;

    public class AccessEx{
        public static void main(String[]ages){
            Sample sample = new Sample();
            sample.a=10;
            sample.b=10;
            sample.c=10;
        }
    }
}
```  
**static 멤버**
```java
class StaticSample{
    int n;
    void g() {...}
    static int m;
    static void f() {...}
}
```
    객체 생성과 non-static 멤버의 생성  
        -non-static 멤버는 객체가 생성될 때,객체마다 생긴다.  

**static 멤버의 생성**  
    static 멤버는 클래스당 하나만 생성  
    객체들에 의해 공유됨  
```java
class StaticSample {
    int n;
    void g() {...}
    static int m;
    static void f() {...}
}
```

**static 멤버 사용**  
    클래스 이름으로 접근 가능  
    ```java
        StaticSample.m=3;
        StaticSample.f();
    ```
    객체의 멤버로 접근 가능  
    ```java
        StaticSample b1= new StaticSample();
        b1.m=3;
        b1.f();
    ```
    non-static 멤버는 클래스 이름으로 접근 안 됨  
    ```java
       StaticSample.m=5;
       StaticSample.g();
    ```
**final 클래스**  
클래스 이름 앞에 사용되면 클래스를 상속받을 수 없음을 지정함.  

**final 메소드**  
메소드 앞에 final이 붙으면 더 이상 오버라이딩 할 수 없음  
부모 클래스의 특정 메소드를 오버라이징 못하게 하고 상속받아 사용하고자 한다면 final로 지정하면 된다  

**final 필드**  
자바에서 final로 필드를 선언하면 필드는 상수가 된다.  
상수 필드는 한번 초기화하면 값을 변경할 수 없다.  

**클래스 상속과 객체**
상속 선언  
    -extends 키워드로 선언  
부모 클래스>슈퍼 클래스  

```java
class Point {
    private int x,y;
    public void set(int x,int y){
        this.x=x; this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}
public class EX5_1 {
    public static void main(String[]args){
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("blue");
        cp.showColorPoint();
    }
}
```

**슈퍼 클래스의 멤버에 대한 다른 서브클래스의 접근**  
접근 지정자가 지정되어있지 않을 때 디폴드 접근 지정이라 부른다  
슈퍼 클래스의 디폴트 멤버는 동일한 패키지에 있는 클래스들에게만 접근이 허용된다  

**슈퍼클래스와 슈퍼클래스의 생성자 선택**  
슈퍼클래스와 서브클래스  
    -각각 여러개의 생성자 작성 가능  

서브클래스의 객체가 생성될 때  
    -슈퍼 클래스 생성자 1개와 서브클래스 생성자 1개가 실행  

서브클래스 생성자와 슈퍼클래스의 생성자가 결정되는 방식  
    1,개발자의 명시적 선택  
        -서브클래스 개발자가 슈퍼클래스의 생성자 명시적 선택  
        -super() 키워드를 이용하여 선택  
    2,컴파일러가 기본 생성자 선택  
        -서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우
        -컴파일러가 자동으로 슈퍼클래스의 기본 생성자 선택  

**업캐스팅**  
서브클래스는 슈퍼클래스의 속성을 상속받는다.  
서브클래스는 슈퍼클래스로 취급할 수 있다.  

서브클래스 객체가 슈퍼클래스 타입으로 변환되는것을 업캐스팅이라 한다  

슈퍼클래스의 레퍼런스가 서브클래스 객체를 가리키도록 치환되는것이 업캐스팅이다  

**다운캐스팅**  
슈퍼클래스 레퍼런스를 서브클래스 레퍼런스에 대입  
업캐스팅된 것을 다시 원래대로 되돌리는 것  
반드시 명시적 타입 변환 지정  


## 4월 05일  
**for-each문**  
for문의 변형으로 배열이나 나열의 크기만큼 루프를 돌면서 각 원소를 순차적으로 접근한다

**2차원 배열**
2차원 배열 선언시 각 원소를 동시에 초기화한다.  
```java
int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}};
char charArray[][] = {{a,b,c},{d,e,f}};
double doubleArray[][] = {{0.01,0.01},{0.03,0.04}};
```

**메소드의 배열 리턴**  
    배열 리턴  
        1,배열의 레퍼런스만 리턴

    메소드의 리턴 타입
        1,리턴하는 배열 타입과 리턴받는 배열의 타입이 일치
        2,리턴 타입에 배열의 크기를 지정하지 않음

```java
    int [] intArray; // makeArray()의 리턴타입과 동일한 타입의 배열 선언 
        intArray = makeArray(); //makeArray()메소드가 리턴하는 배열을 받음
```

**자바의 예외처리**
    예외
        실행중 오작동이나 악영향을 미치는 예상치 못한 상황 발생
            1,자바에서는 실행중 발생하는 에러를 예외로 처리
        실행중 예외가 발생하면
            1,자바플랫폼은 응용프로그램이 예외를 처리하도록 호출
                -응용 프로그램이 예외를 처리하지 않으면 프로그램을 강제종료함
        예외 발생 경우
            1,정수를 0으로 나누는 경우
            2,배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
            3,정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우

 ```java
    try{
        예외가 발생할 가능성이 있는 실행분(try블록)
    }
    catch(처리할 예외타입 선언){
        예외처리문
    }finally
        finally 불록문
```
```java
import java.util.Scanner;
public class EX3_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int end;
        int sor;
        
        System.out.println("나뉨수를 입력하세요");
        end = scanner.nextInt();
        System.out.println("나눔수를 입력하세요");
        sor = scanner.nextInt();
        try{
            System.out.println(end+"를"+sor+"로 나누면 몫은"+end/sor+"입니다");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
        finally{
            scanner.close();
        }

    }
}
```


**자바의 개체 특성:상속**  
상속은 상위 개체의 속성이 하위 개체에 물려져서 하위 개체가 상위 개체의 속성을 모두 가지는 관계이다.  

**다향성**  
    1,같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것  
    2,다향성 사례  
        -메소드 오버로딩:한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드  
        -메소드 오버리이딩:슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현  

**객체 지향 언어의 목적**  
    소프트웨어의 생산성 향상  
        1,컴퓨터 산업 발전에 따라 소프트웨어의 생명주기 단축  
            -소프트웨어를 빠른 속도로 생상할 필요성 중대  
        2,객체 지향 언어  
            -상속,다향성,객체,캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장  
            -소프트웨어 재사용과 부분 수정 빠름  
            -부분 수정을 통해 소프트웨러를 작성하는 부담을 대폭 줄일 수 있음.  
    실세계에 대한 쉬운 모델링  
        1,실세계의 일을 보다 쉽게 프로그래밍 할 수 있는 객체지향 언어 필요.  

**클래스와 객체**  
    클래스  
        1,객체의 속성과 행위 선언  
        2,객체의 설계도 혹은 틀  
    객체  
        1,클래스의 틀로 직어낸 실체  
            -프로그램 실행 중에 생성되는 실체  
            -메모리 공간을 갖는 구체적인 실체  
            -인스턴스 라고도 부름  

**자바 클래스 구성**  
    클래스  
        1,class키워드로 선언
        2,멤버:클래스 구성요소  
            -필드(멤버변수)와 메소드(멤버함수)  
        3,클래스에 대한 public접근 지정:다른 모든 클래스에서 클래스 사용 허락  
        4,멤버에 대한 public접근 지정:다른 모든 클래스에게 멤버 접근 허용  
```java
    public class Circle{
        int radius;
        String name;

        public double getArea(){
            return 3.14*radius*radius;
        }

        public static void main(string[]args){
            Circle pizza;//래퍼런스 변수 pizza 선언 : 이 선언문으로 Circle 객체는 생성하지 않음, 변수 pizza 는 Circle 타입의 객체를 가리키는 레퍼런스 변수일 뿐 객체 자체는 아님 이를 객체이름 이라고도 부름
            pizza.radius=10;
            pizza.name="자바피자";
            double area = pizza;
            
            Circle donut = new Circle();
            donut.radius = 2;
            donut.name= "자바도넛";
            area = donut.getArea();
            System.out.println(donut.name+"면적은"+area);
        }
    }
```

```java
public class Circle {
    int rad;
    String name;
    
    public Circle(){
        rad = 1; name = "";
    }

    public Circle(int r, String n){
        rad = r;
        name = n;
    }

    public double getArea(){
        return 3.14*rad*rad;
    }
    public static void main(String[] args){
        Circle pizza = new Circle(10, "피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"면적"+area);

        Circle donut = new Circle();
        donut.name = "도넛";
        area = donut.getArea();
        System.out.println(donut.name+"면적"+area);
    }
}
```  

**생성자**  
    기본생성자  
        -매개변수가 없고 또한 실행코드가 없어 아무 일도 하지 않는 단순 리턴하는 생성자이다  
    기본생성자가 자동으로 생성되는 경우  
        -생성자가 없는 클래스는 존재할 수 없으므로 클래스 생성자가 선언되어있지 않으면 컴파일러가 기본생성자를 자동으로 생성한다.  
    기본생성자가 자동으로 생성되지 않는 경우  
        -생성자가 하나라도 존재하는 클래스에는 컴파일러가 기본 생성자를 임의로 삽입해 주지 않는다. 다음 new 문장은 매개변수를 가진 Circle(int r) 생성자를 호출한다  

```java
public class Book{
    String ti;
    String aut;

    public Book(String t){
        ti=t;
        aut="적자미상";
    }
    public Book(String t,String a){
        ti=t;
        aut=a;
    }
    public static void main(String[]args){
        Book littlePrince = new Book("어린왕자","셰익스피어");
        
        Book loveStory =  new Book("춘향전");
        System.out.println(littlePrince.ti+""+littlePrince.aut);
        System.out.println(loveStory.ti+""+loveStory.aut);
    }
}
```  

**this 레퍼런스**  
    1,this  
        -객체 자신에 대한 레퍼런스  
            -컴파일러에 의해 자동으로 관리됨 따라서 개발자는 사용하기만 하면 된다.  

```java
    public class Circle{
        int radius;
        public Circle(int radius){
            this.radius=radius;
        }
        public static void main(){
            Circle ob1 = new Circle(1);
            Circle ob2 = new Circle(2);
            Circle ob3 = new Circle(3);

            ob1.set(4);
            ob2.set(5);
            ob3.set(6);
        }
    }
```  
    2,this()로 다른 생성자 호출  
        -같은 클래스의 다른 생성자 호출  
        -생성자 내에서만 사용 가능  
        -생성자 코드의 제일 처음에 있어야 함  

**객체 배열**  
    1,레퍼런스를 원소로 갖는 배열  
      
**배열 선언 및 생성**  
    1,배열에 대한 레퍼런스 선언  
    2,레퍼런스 배열 선언  
    3,객체생성  
  
**메소드**  
    메소드는 C/C++의 함수와 동일  
    자바의 모든 메소드는 반드시 클래스 안에 있어야함  
  
    접근지정자  
        -다른 클래스에서 메소드를 접근할 수 있는지 여부 선언  
        -public,private,protected,디폴트  
    리턴타입  
        -메소드가 리턴하는 값이 데이터 타입  

**인자전달**  
    매개 변수가 byte,int,double등 기본 타입으로 선언되었을 때  
        -호출자가 건네는 값이 매개 변수에 복사되어 전달,실인자 값은 변경되지 않음  
    배달 레퍼런스만 매개 변수에 전달  
        -배열 통째로 전달되지 않음  
    객체가 전달되는 경우와 동일  
        -매개 실인자의 배열 공유  

**메소드 오버로딩**  
    오버로딩  
        한 클래스 내에서 두개 이상의 이름이 같은 메소드 작성  
            -메소드 이름이 동일하여야 함  
            -매개 변수와의 개수가 서로 다르거나 타입이 서로 달라야함  
            -리턴 타입은 오버로딩과 관련이 없음  
**객체소멸**  
    1,new에 의해 할당받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위  
    2,소멸된 객체 공간은 가용 메모리에 포함  
자바에서 사용자 임의로 객체소멸 할 수 없음  
    1,자바는 객체 소멸 연산자 없음  
        -객체 생성 연산자 : new  
    2,객체 소멸은 자바 가상 기계의 고유한 역할  
    3,자바 개발자에게는 매우 다행스러운 기능  
        -C/C++에서는 할당 받은 객체를 개발자가 프로그램내에서 삭제해야 함  
        -C/C++의 프로그램 작성을 어렵게 만드는 원인  

**가비지**  
    1,가리키는 레퍼런스가 하나도 없는 객체  
        -더 이상 접근할 수 없어 사용할 수 없게 된 메모리  
    2,가비지 컬렉션  
        -자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집,반환  
  
**가비지 컬렉션**  
    1,자바 가상 기계가 가비지 자동 회수  
        -가용 메모리 공간이 일정 이하로 부족해질 때  
        -가비지를 수거하여 가용 메모리 공간으로 확보  
    2,가비지 컬렉터에 의해 자동 수행  
      
    3,강제 가비지 컬렉션 강제수행  
        -System 도는 runtime 객체의 gc()메소드 호출  
            -이 코드는 자바 가상 기계에 강력한 가비지 컬렉션 요청  
            -그러나 자바 가상 기계가 가비지 컬렉션 시점을 전적으로 판단  

**자바의 패키지 개념**  
    1,패키지  
        -상호 관련 있는 클래스 파일을 저장하여 관리하는 디렉터리  
        -자바 응용 프로그램은 하나 이상의 패키지로 구성  

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

