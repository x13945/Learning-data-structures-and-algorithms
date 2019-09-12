# 单例模式

单例模式是在程序运行期间，一个类只会生成一个实例。实现方式有多种，对于对象初始化成本比较低的，建议使用`饿汉模式`;对于有lazy加载需求的，建议使用`静态类`或者`双重校验来实现`我们来看一下：

## 饿汉模式

线程安全，但是效率不高。利用类只会被加载一次实现单例。

示例：[HungrySingleton](./HungrySingleton.java)

## 懒汉模式-线程不安全
性能比较好，但是非线程安全

示例：[LazySingleton](./LazySingleton.java)

## 懒汉模式-线程安全
性能比较好，但是非线程安全

示例：[LazySingleton](./LazySingleton.java)

## 双重校验
性能比较好，同时线程安全

示例：[DoubleCheckSingleton](./DoubleCheckSingleton.java)

## 静态内部类

同样是借助classloader来实现的单例，但是具备延迟初始化以及线程安全

示例：[InnerClassSingleton](./InnerClassSingleton.java)


