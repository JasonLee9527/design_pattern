# 单例模式
## 定义
确保一个雷只有一个实例, 并提供全局访问点
## 场景
- 如线程池、缓存等对象。

- 经典双锁模式, 需要 volatile 关键字

- 私有化构造方法的作用
    - 不让其他类有创造该对象的可能
- 静态 getInstance 方法的作用
    - 因为其他类不能创建该对象, 只能用类的静态方法获取实例
- 第一次判空的作用
    - 空才需要创建,不空直接返回
- 加锁的作用
    - 只能有一个对象在创建对象
- 第二次判空的作用
    - 万一第一个对象还没创建完, 第二个对象完成了第一次判空等到锁上了, 第一个对象创建完了,第二个对象拿到锁想再创建一次,所以要再判断一次有没有已经创建完成
- volatile 的作用: 防止重排序
    - uniqueInstance = new Singleton(); 
    - 1. 分配内存
    - 2. 初始化对象
    - 3. 将内存地址付给变量
    - 正常 1,2,3, 编译器可能 1,3,2, 这样的话万一第一个对象做了 1,3, 第二个对象判断不空就拿去用了, 就会拿到一个空对象
    - 这里volatile 就是防止指令重排序的 (当然 volatile 还有内存可见性的功能,只是这里没用到)

```java
public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
```

## 讲解
https://www.cnblogs.com/adamjwh/p/9033554.html