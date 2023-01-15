fun main() {
    println(arr1(10, 20, 30, 40, 50, 586).contentToString())
}
    fun arr1(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Array<Int> {
        val arr2 = fun(d: Int) = d % 3
        val arr1 = Array<Int>(6) { 0 }
        arr1[0] = arr2(a)
        arr1[1] = arr2(b)
        arr1[2] = arr2(c)
        arr1[3] = arr2(d)
        arr1[4] = arr2(e)
        arr1[5] = arr2(d)
        arr1.sort()
        return arr1
    }