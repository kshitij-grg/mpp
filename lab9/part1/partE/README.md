**1. When the type D is a Class**

Well, JAVA does not support multiple inheritance which basically means that when
D is a class it simply avoids the Diamond problem by not allowing multiple
inheritance of classes, B and C. That means, we have to use composition or
interfaces instead.

**2. When the type D is an Interface**

Well, JAVA allows multiple inheritance through default methods introduced in 
interface. So to avoid the Diamond problem, the inheriting interface D must
override the method and explicitly resolve the conflict either
B.super.method() or C.super.method().