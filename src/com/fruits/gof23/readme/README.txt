OOP Principals

开放闭合原则：对扩展是开放的，对修改是封闭的。
单一职责原则：一个类，最好只做一件事。单一职责原则可以看做是低耦合、高内聚的引申。
依赖导致原则：依赖于抽象。具体而言就是高层模块不依赖于底层模块，二者都依赖于抽象；抽象不依赖于具体，具体依赖于抽象。
接口隔离原则：使用多个小的专用接口，而不是使用一个大的总接口。一个类对于另外一个类的依赖应该建立在最小的接口上，不要强迫不用的方法，这是一种接口污染。
分离的手段：1、委托分离，通过增加一个新的类型来委托客户请求，隔离客户和接口的直接依赖，但是会增加系统的开销。2、多重继承分离，通过接口多继承来实现客户的需求。
Liskov替换原则：类必须能够替换其基类。Liskov替换原则能够保证系统具有良好的拓展性，同时实现基于多态的抽象机制，能够减少代码冗余，避免运行期的类型判别。
