fun main() {
var a:String? = null//NPE (Null pointer exception)
val b:Int? = null //NPE
var c:Short? = null //NPE
if (a!= null) {println(a.length)}
    else if (b!= null){println(b.toShort())}
    else if (c!=null) {println(c.toString().length)}
}
