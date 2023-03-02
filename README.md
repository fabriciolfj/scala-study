# scala-study
- object -> equivale a criar métodos statics em java
- case class -> equivale as classes record em java
- class -> classe normal em java, mas tudo dentro dela {} ou até o end NomeClasse, faz parte do construtor
- trail -> equivale a classe abstrata ou interfaces em java
- enums -> similar ao java

## Estendendo classes
- quando uma classe estende uma classe base, e essa classe base possui parâmetros var, na classe filha utilize um nome diferente para não colidir
- por exemplo:
```
class Person(var name: String)

// note the use of '_name' here
class Employee(_name: String, var age: Int) extends Person(_name):
    override def toString = s"$name is $age"
```
- ou, podemos utilizar um método apply, e deixando o construtor de employee privado
```
class Employee private extends Person(""):
    var age = 0
    println("Employee constructor called")
    override def toString = s"$name is $age"

object Employee:
    def apply(_name: String, _age: Int) =
        val e = new Employee()
        e.name = _name
        e.age = _age
        e
```
- um construtor principal de uma subclasse, pode apontar para o construtor principal ou auxiliar de uma superclasse
- o construtor auxiliar de uma subclasse, so consegui apontar para o construtor principal dela mesma.

## Convenção
- para modificar getters e setters, para parâmetros privados
```
class Person(private var _name: String):
    def name = _name                                  // accessor
    def name_=(aName: String): Unit = _name = aName   // mutator
```

## Uso do lazy
- caso queria iniciar um bloco de codigo tardiamente, anote-o com lazy
- por exemplo, na declaracao de metodos dentro do construtor da classe, caso anote com lazy, será invocado apenas se chamar, caso contrário
- ele será invocado na construção da classe

## Classes case 
- gera varios codigos boilerplate, como:
  -  toString
  - get e seter (para campos var)
  - construtor padrao
  - equals e hashcode
  - copy
  - unapply, usado para maths
- podemos criar construtores auxiliares para classes case, via objects:
- exemplo:
```
case class Car(var ano: Int, var modelo: String)

object Car {
  def apply() = new Car(0, "none")
  def apply(modelo: String) = new Car(0, modelo)
}
```

## Traits (interfaces)
- similar as interfaces no java
- podem ter métodos concretos, ou seja, corpo
- ou abstratos, ou seja, sem corpo

## Sobreesrevendo metodos
- quando a trait possuir var, apenas chamamos a variavel na classe que a extendeu
- quando a trait possuir val, aplicamos um override na variavel na classe que a extendeu
- quando e um def (indicado para metodos abstratos), usamos um override del na classe que a extendeu
- abaixo uns exemplos:
```
  num2 = 30
  
  override val num1: Int = 1

  override def num: Int = 10
```



## continuar 6.3