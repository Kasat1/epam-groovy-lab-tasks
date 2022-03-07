package groovylab

class App {
    static void main(String[] args) {
        println "Hello world"
        println Task01.sum(1,4)
        println Task02.mulEvenOdd([4,5,6])
        println Task03.isSublist([1,2,3], [2,3])
        println Task04.fib(6)
        println Task05.isIp("10.0.152.164")
        println Task06.adults([Kate: 24, Alan:16, Osvald: 18])
        println Task07.encryptThis("Hi Peter PArker")
        println Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}")
        println Task09.exec("pwd")
        println Task10.urlText("http://httpstat.us/200")
        println Task11.gstring("test", 1)
    }
}
