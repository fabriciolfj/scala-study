# scala-study
- object -> equivale a criar métodos statics em java
- case class -> equivale as classes record em java
- class -> classe normal em java, mas tudo dentro dela {} ou até o end NomeClasse, faz parte do construtor
- trail -> equivale a classe abstrata ou interfaces em java
- enums -> similar ao java

## classes
- quando possui um parâmetro:
  - val, gera getter
  - var, gera getter e setter
  - nao informado, se comporta como private, não gera getter e nem setter.

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
  - get para parametros val
  - nao gera get e nem set para parametros sem var e val (são tratados apenas como private)
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
- quando e um def (indicado para metodos abstratos), usamos um override def na classe que a extendeu
- abaixo uns exemplos:
```
  num2 = 30
  
  override val num1: Int = 1

  override def num: Int = 10
```

## Mixins
- multiplas características são usadas para compor uma classe, por exemplo:
```
@main def executeMixin() : Unit = {
  val zeus = new Pet("Zeus") with MansBestFriend with HasTail with HasLegs
}
```

## Parametros em trait
- trait pode extender outra trait, mas caso a trait base tenha parametro, a trait filha não consegui passar
- ao extender uma trait, e esta com parametro, minha classe deve ter um parametro com override de mesmo nome e tipo
- para acessar o parametro da interface, este deve ser val ou var, não definido nao gera get
- uma trait pode extender outra, e essa pode implementar ou sobreescrever seus métodos

## Tipo soma e tipo produto
- tipo produto -> a quantidade de instâncias possíveis de um tipo, multiplica o número de possibilidades de todos os seus campos contrutores
```
case class DoubleBoo(b1: Bool, b2: Bool) = 4
```
- tipo soma -> você determina o número de possibilidades ou instancias
```
enum Bool:
   case True, False = 2
```

## Uso de métodos ou membro estáticos
- dentro d classe, defina um object do mesmo nome
```
class Pizza(var tempero: String)
  override def toString = s"tempero $tempero"
  
object Pizza:
  val TEMPERO1 = "tempero1"
```
- tanto a classe como o object, possui acesso a membros privados um do outro
```
class Foo:
    private val secret = 42

object Foo:
    // access the private class field `secret`
    def doubleFoo(foo: Foo) = foo.secret * 2

@main def fooMain =
    val f = Foo()
    println(Foo.doubleFoo(f))  // prints 84
```

## metodos
### escopos
- privado -> disponivel para instancia atual de uma classe e para outras suas instancias
- protected -> método está disponível para instancia atual e subclasses
- para deixar o método disponivel apenas para os membros do pacote atual, utilize private[packageName], exemplo:
```
package com.devdaily.coolapp.model:
    class Foo:
        // this is in “package scope”
        private[model] def privateModelMethod = ??? // can be accessed by
                                                    // classes in
                                                    // com.devdaily.coolapp.model
        private def privateMethod = ???
        protected def protectedMethod = ???

    class Bar:
        val f = Foo()
        f.privateModelMethod   // compiles
        // f.privateMethod     // won’t compile
        // f.protectedMethod   // won’t compile
```
- podemos também deixar em vários níveis de pacote, exemplo:
```
package com.devdaily.coolapp.model:
    class Foo:
        // available under com.devdaily.coolapp.model
        private[model] def doUnderModel = ???

        // available under com.devdaily.coolapp
        private[coolapp] def doUnderCoolapp = ???

        // available under com.devdaily
        private[devdaily] def doUnderAcme = ???

import com.devdaily.coolapp.model.Foo

package com.devdaily.coolapp.view:
    class Bar:
        val f = Foo()
        // f.doUnderModel  // won’t compile
        f.doUnderCoolapp
        f.doUnderAcme

package com.devdaily.common:
    class Bar:
        val f = Foo()
        // f.doUnderModel     // won’t compile
        // f.doUnderCoolapp   // won’t compile
        f.doUnderAcme
```
- publico quando não definimos nenhum modificador, qualquer classe pode acessar o método


## Metodos de acesso sem parênteses
- metodos acessadores sem efeito colateral, por convenção, não deve ser chamados com parênteses

## Construção fluente de uma classe
- deve declarar this.type como tipo de retorno do método e retornar this, caso a classe possa ser extendida
- ou apenas retornar this, sem clarar o this.type caso ela não possa ser extendida (declaracao como final por exemplo)
- exemplo que não possa ser extendida:
```
final class Pizza:
    import scala.collection.mutable.ArrayBuffer

    private val toppings = ArrayBuffer[Topping]()
    private var crustSize = Medium
    private var crustType = Regular

    def addTopping(topping: Topping) =
        toppings += topping
        this

    def setCrustSize(crustSize: CrustSize) =
        this.crustSize = crustSize
        this

    def setCrustType(crustType: CrustType) =
        this.crustType = crustType
        this

    def print() =
        println(s"crust size: $crustSize")
        println(s"crust type: $crustType")
        println(s"toppings:   $toppings")
end Pizza
```

## metodos de extensão
- acrescentar funcionalidades a classes fechadas, como String e Int por exemplo

## Imports e packages
- podemos usar o import em qualquer parte da classe
- podemos importar classes, métodos estáticos.
- podemos renomear classes no import ou métodos, dando lhes um alias, conforme o exemplo abaixo:
```
import java.util.{Date as JDate, HashMap as JHashMap, *}
import System.out.{println as p}
```
- também podemos ocultar membros, utilizando o caractere _
```
import java.util.{List => _, Map => _, Set => _, *}
```
- obs o coringa * sempre deve ser o ultimo membro do import
- posso utilizar o import:
  - no cabeçalho da classe, apos o package
  - dentro de um método
  - abaixo da declaração da classe
  - dentro de um bloco de um método
  - ex:
```
def printRandom =
    {
        import scala.util.Random
        val r1 = Random()   //this works, as expected
    }
    val r2 = Random()       //error: not found: Random
```

### cotinuar 10.2