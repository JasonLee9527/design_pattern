# 命令模式
## 定义
将请求封装成对象,以便使用不同的请求、队列或日志来参数化其他对象。命令模式也支持可撤销的操作。
## 场景

- Command接口: execute(), undo() 
- ConcreteCommand: receiver 属性持有执行者, execute() 执行执行者的相应动作, undo() 执行执行者的相应命令
- Invoker: command 属性持有命令, setCommand() 设置命令, doSomething() 调用命令
- Receiver: action() 真正的命令执行者

> Invoker 可以持有命令列表, 多个 doSomething() 来执行各个命令

### 基本场景: 遥控器开关灯
- Command接口: execute(), undo() 
- ConcreteCommand: 开灯命令, 持有灯对象, execute() 执行灯对象的打开操作
- Invoker: command 属性开灯命令, setCommand() 设置开灯命令, doSomething() 调用开灯命令
- Receiver: 灯对象

### 根据状态决定执行什么命令
- Receiver 持有状态属性,例如灯有现在是开还是关的状态, 电扇有几档的状态
- ConcreteCommand中可以获取 Receiver 的状态, 并在execute()/undo() 中根据状态决定具体要执行的 action()

### 组合命令
一个命令控制一组动作

- 某个 ConcreteCommand 作为一个特殊的命令,持有一组命令,execute() 时依次执行每个命令的相应方法

## 讲解
https://www.cnblogs.com/adamjwh/p/10923122.html