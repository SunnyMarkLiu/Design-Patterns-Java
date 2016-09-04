# Mediator Pattern

## 案例需求-客户信息管理窗口的初始设计
<p>Sunny软件公司欲开发一套CRM系统，其中包含一个客户信息管理模块，所设计的“客户信息管理窗口”
Sunny公司开发人员通过分析发现，界面组件之间存在较为复杂的交互关系：如果删除一个客户，要在客户
列表(List)中删掉对应的项，客户选择组合框(ComboBox)中客户名称也将减少一个；如果增加一个客户
信息，客户列表中需增加一个客户，且组合框中也将增加一项。如何实现界面组件之间的交互是Sunny公司
开发人员必须面对的一个问题</p>

## UML 结构图
![Mediator uml](https://github.com/SunnyMarkLiu/Awesome-Design-Patterns/blob/master/BehavioralPattern/Mediator/mediator.jpg)

