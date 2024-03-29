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

### funcao como variavel
- podemos montar uma função e atribui-la a uma variável, por exemplo:
```
val double = (i: Int) => i *2
```
- podemos declarar também explicitamente o tipo de retorno
```
val double: (Int) => Int = i => { i * 2 }
```

### funcao parcialmente aplicada
- podemos omitir algum parâmetro da função
- o resultado e uma funcao parcialmente aplicada, onde este resultado, que é outra função, pode passar o parâmetro pendente.
- assim obtendo o resultado final
```
scala> val addTo3 = soma(1, 2, _)
val addTo3: Int => Int = Lambda ...

scala> addTo3(10) 
res0: Int = 13
```

### funcao parcial
- quando a função consegui ser executada, apenas para alguns parâmetros, por exemplo:
```
val divide = new PartialFunction[Int, Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int) = x != 0
}

val x = if divide.isDefinedAt(1) then Some(divide(1)) else None 
val x: Option[Int] = Some(42)
```
- o collect funciona com o partialfunction, pois ele executa o isDefinedAt antes de chamar o apply (o map não faz isso)
```
  val result = List(0, 1, 2).collect(divide)
```

### given
- quando queremos criar um metodo de uso implicito
```
given personOrdering: Ordering[Person] with {
  override def compare(x: Person, y: Person): Int = 
    x.surname.compareTo(y.surname)
}
```
- podemos referenciar o uso dele 
```
def listPeople(persons: Seq[Person])(using ordering: Ordering[Person]) = ...
```
- e na chamada, nao precisamos passar ele explicitamente
```
listPeople(List(Person("Weasley", "Ron", 15), Person("Potter", "Harry", 15))) 
```

### implicit
- Em Scala, a palavra reservada "implicit" é usada para indicar que um valor pode ser encontrado automaticamente pelo compilador e injetado em um determinado contexto sem a necessidade de uma referência explícita.


## Colecoes
- é imutabél (deposi de criada, nao conseguimos adicionar ou remover elementos, a nao ser que atribuimos a uma nova variavel) ou mutavel(conseguimos add ou remover elementos)
- indexada ou linear(lista encadeada)
- para acesso aleatório utilize Indexados (IndexedSeq, Vector)
- para operacoes head e tail, utilize listas encadeadas como: LinearSeq
- para utilizar um sequencia mutavel, sugerido é ArrayBuffer
- para lista encadeadas pode utilizar List (imutavel) ou ListBuffer (multavel)
- Set como em java, é uma coleção de elementos únicos

### view
- coleçoes preguiçosas para metodos transformadores (map, filter, reverse), os elementos são chamados quando precisa
- ideal para grande colecoes
- ideal para performance e economica de memoria

### operadores
- predicate - retorna true ou false com base em uma função
- funções anônimas
- loops implícitos, como filter, foreach, map, reduceLeft

#### iterator
- ideal para desempenho, leitura de arquivos grandes
- ele se esgota, ou seja, apos iterar sobre ele, a segunda vez não terá nenhum resultado.
- podemos usar os operadores comuns, como map, filter, for
- ele é lazy ou seja, preguiçoso, é executada a iteração quando é chamada (foreach por ex)
- podemos usar o bufferedIterator, para espiar o iterator sem precisar mover (chamar o next)

#### uso do dropRight e takeRight
- são lentos no uso em uma list
- utilize melhor em listas indexadas, como Vector

### varargs
- para passar uma lista a um metodo que recebe um varargs, temos que utilizar : _*
- ja o método que recebe como parâmetro o varargs, seria strings: String*
- se tentarmos passar uma lista direta a um método que espera um varargs, receberemos um erro de compilação.

### stack (pilha)
- ultimo que entrada, primeiro que sai
- incluir no topo e no inicio são rapidos
- alguns operadores:
```
val s = Stack[Int]()        // s: collection.mutable.Stack[Int] = Stack()
s.push(1)                   // s: Stack(1)
s.push(2,3)                 // s: Stack(3, 2, 1)
s.pushAll(List(4,5))        // s: Stack(5, 4, 3, 2, 1)
val a = s.pop               // a=5, s=Stack(4, 3, 2, 1)
val b = s.popWhile(_ > 2)   // b=List(4, 3), s=Stack(2, 1)
val c = s.popAll            // c=List(1, 2), s=Stack()
```

### lendo ou escrevendo arquivos
- scala usa as classes em java, principalmente para arquivos binarios
- mas temos o Source.fromFile, que podemos utilizar para ler o conteudo do arquivo

### criando um projeto via sbt
```
sbt new scala/scala3.g8
```
- obs da conflito quando possui graalvm instalada na maquina

### passando parametros da jvm
```
 sbt -v -J-Xmx2048m "run teste"
```

### exemplo de um arquivo build.sbt com mais de uma dependencia:
```
val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "crud-customer",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.9.0",
      "org.typelevel" %% "cats-effect" % "3.4.8",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
```


### especificando um main para ser executado
```
sbt "runMain com.github.fabriciolfj.hello teste"
```

### especificando um main para ser incluido no jar
```
inclua no arquivo build.sbt
// set the main class for the 'sbt run' task
Compile / run / mainClass := Some("com.alvinalexander.myproject.Foo")

// set the main class for the 'sbt package' task
Compile / packageBin / mainClass := Some("com.alvinalexander.myproject.Foo")
```

### executar arquivo jar
- para execurtar o arquivo jar gerado pelo sbt package, precisa do plugin abaixo, que deve-se ser inserido no arquivo project/assembly.sbt
```
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.1")
```
- execute:
```
sbt assembly
```
- podemos dar um show para mostrar o local do jar gerado e executado (ele pegará o main vinculado)
- abaixo um build.sbt completo com assembly
```
val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "crud-customer",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.9.0",
      "org.typelevel" %% "cats-effect" % "3.4.8",
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.scalatest" %% "scalatest" % "latest.integration" % "test"
    ),

    assembly / mainClass := Some("com.github.fabriciolfj.Hello"),

    Compile / run / mainClass := Some("com.github.fabriciolfj.Hello"),

    assembly / assemblyJarName := "MyApp.jar",

    publishTo := Some (Resolver.file("file", new File("./out")))
  )
```

## future
- para utilizar o future, precisamos de um pool de threads, que pode ser fornecido pelo import:
```
import concurrent.ExecutionContext.Implicits.global 
```

## akka
- trabalha-se com actors (atores)
- encapusula o estado e comportamento
- ele tem uma caixa de entrada que recebe mensagens e as processas

### solução akka OOP (orientada a objetos)
- uma solução akka oop e uma combinação:
- um object (similar a metodo static) para criar uma classe via apply (complementar)
- uma classe privada que extende AbstrctBehavior e implementa o metodo abstrato onMessage

# Resumo dos objetos em scala
## trait
```
Em Scala, um `trait` é uma abstração de interface que pode conter métodos abstratos, métodos concretos, valores e campos. 
Ele é semelhante a uma interface em outras linguagens de programação, 
mas com algumas diferenças importantes, como a possibilidade de ter implementações de método e a possibilidade de ter campos e valores concretos. 
Um `trait` pode ser estendido por classes e outros `traits`, e uma classe pode estender múltiplos `traits`. 
Dessa forma, o `trait` permite criar hierarquias de tipos que podem compartilhar comportamentos comuns, 
sem a necessidade de herança múltipla. Isso torna o código mais modular e flexível.
```

## object
```
Em Scala, o `object` é um singleton, ou seja, é um objeto que representa uma classe única e 
pode ter apenas uma instância durante o tempo de vida do programa. 
O `object` pode ser utilizado para definir métodos e valores que pertencem à classe única, 
sem precisar criar uma instância dessa classe. Além disso, 
os `object`s podem ser usados como módulos para agrupar métodos e valores relacionados em um único lugar.
```


## case classe
```
Em Scala, uma case class é uma classe que é otimizada para ser usada como um objeto de valor imutável (value object). 
Ela é criada usando a palavra-chave case class e possui várias propriedades úteis, 
como uma implementação padrão de equals, hashCode e toString baseada nas suas propriedades, além de suporte a desestruturação (pattern matching) em expressões.
Ao criar uma case class em Scala, o compilador gera automaticamente métodos para as propriedades da classe, 
tornando-a uma maneira conveniente e concisa de definir classes simples que contêm apenas dados. 
```

## classe  java vs scala
```
Em Scala, uma classe é semelhante a uma classe em Java, pois permite definir
um conjunto de métodos e propriedades que podem ser usados para criar objetos. 
No entanto, há algumas diferenças importantes entre as classes em Scala e Java:

- Em Scala, as classes são geralmente mais concisas do que em Java, porque o compilador pode inferir o tipo das propriedades e métodos com base no contexto em que são usados.
- Em Scala, as classes podem ser definidas como "case classes", que são usadas principalmente para representar dados imutáveis. As "case classes" fornecem métodos de comparação e hashcode predefinidos, bem como uma sintaxe mais concisa para criar objetos e desestruturá-los.
- Em Scala, as classes podem ter construtores secundários, o que permite que você defina vários construtores com assinaturas diferentes.
- Em Scala, as classes podem ter membros "abstract", que são propriedades e métodos que não têm implementação e devem ser implementados por subclasses. Isso é semelhante ao recurso de "interface" em Java, mas com mais flexibilidade e recursos.

Essas são algumas das diferenças entre as classes em Scala e Java,
 mas há muitas outras diferenças sutis e recursos interessantes que Scala oferece em relação a Java.
```

# Spark
- mecanismo de análise de dados unificado, para processamento em larga escala

## RDD (resilient ditributed dataset)
- permite que trate os dados como uma grande planilha distribuída
- podemos depois converter em um DataFrame, onde possubilita criar consultas semelhantes ao SQL
