# 模板方法模式
## 定义
在一个方法中定义算法的骨架,而将一些步骤延迟到子类中。模板方法是的子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤。

## 场景

- 父类抽象类定义模板方法, 内容包括一组步骤方法,
- 父类定义模板方法用到的一组步骤方法, 步骤方法有三种:
    - 抽象方法, 由子类实现
    - final方法, 父类实现且不允许修改
    - 普通方法, 又叫钩子方法, 子类可以覆写,也可以不覆写

- 特殊情况: 可能某个步骤方法的内部一部分方法,可能需要子类实现, 这种方法父类可以写成抽象方法或者提供默认实现

## 讲解
https://www.cnblogs.com/adamjwh/p/10919149.html