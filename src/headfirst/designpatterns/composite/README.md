# 组合模式

## 定义
允许你将对象组成树形结构来表现"整体/部分"的层次结构。组合能让客户以一致的方式处理个别对象和对象组合。

## 场景
当涉及到层次对象或者递归层次时可以考虑使用组合模式。例如: 文件夹与文件, 就是典型的这种层次结构

- Component: 抽象类, 包含组合对象和个别对象的所有方法, 默认提供不支持或返回 false 的实现
    - operation()
    - add(Component)
    - remove(Component)
    - getChild()
- Composite: 继承 Component并实现相应方法
    - operation()
    - add(Component)
    - remove(Component)
    - getChild()
- Leaf: 单个对象, 实现具体对象的方法
    - operation()

> 组合模式牺牲了单一责任的设计原则, 但换取了透明性, 为用户提供了使用上的方便

## 外部遍历: 组合模式的通用遍历
- 自己实现遍历的 Iterator 的话, 因为要保留结构, 可以利用栈的数据结构
- 栈的结构保存每个组件的迭代器, 组的迭代器是对象, 对象的迭代器其实没内容, hasNext()永远返回 false
- 构造方法初始化时将顶层组合的迭代器 push 到栈中
- hasNext()方法: 先判断栈是否为空, 不为空的话取出顶上的迭代器(peek 不是 pop), 如果迭代器没有元素则 pop 掉,递归该方法找下一个迭代器。如果迭代器有元素则返回 true
- next()方法: 先用 hasNext 看下是否有元素,有的话取出顶上迭代器(peek 不是 pop), 从迭代器中取第一个元素,如果是组合,则把组合的迭代器 push 到栈中,最后返回元素

## 内部遍历: 组合模式的具体方法调用,如 print
- 如果是全部遍历可以采用, 可以在方法内部用 iterator 递归调用该方法

## 讲解
https://www.cnblogs.com/adamjwh/p/9033547.html